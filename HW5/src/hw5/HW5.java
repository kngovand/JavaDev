/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;
import java.io.*;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Kevin Ngovanduc ~ MSU- Denver <kevinvanduc@gmail.com>
 */
public class HW5 {
    
    private static Bag<Team> listOfTeams;
    private static final String INPUT_FILE = "C:/Users/Kevin/Desktop/hw2input1.txt" ;
    private static final String OUTPUT_FILE = "C:/Users/Kevin/Desktop/hw2output1.txt" ;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        listOfTeams = new Bag<Team>(100);
       
       if(processInput()) {
           System.out.println("\n"); display();
           System.out.println("\n\nNow executing selection sort.\n\n");
           listOfTeams.selectionSort();
           display();
           generateReport();
           System.out.println("\n\nNow executing quick sort.\n\n");
           Comparator comp = new CompByName();
           listOfTeams.quickSort(comp);
           display();
           generateReport();
       }     
    }
    
    // Takes input, processes information.
    public static boolean processInput() {
        
        boolean result = false;
        File file = new File (INPUT_FILE);
        
        try {
            Scanner key = new Scanner(file);
            while(key.hasNext()) {
                String line = key.nextLine();
                String[] info = line.split(",");

                if(info[0].equals("TEAM")) {
                    processTeam(info);
                }
            }
            result = true;
        }
        
        catch(FileNotFoundException ex) {
            System.err.println("File not found.");
        }
        
        return result;
    }
    
    
    //Processes info for a team object.
    public static void processTeam(String[] info){
        if(info[1].equals("ADD")) {
            Team team = new Team(info[2], info[3], info[4], info[5], info[6], info[7]);
        
            if(!team.validateEmail(info[7])) {
                System.err.println("ERROR EMAIL IS INVALID");
            }

            if(listOfTeams.add(team)) {
                System.out.println("Team added to list.");
            }
            
            else {
                System.err.println("Team not added.");
            }
        
        }
        
        else if(info[1].equals("DEL")) {
            Team team = new Team(info[2], null, null, null, null, null);  
            
            if(listOfTeams.remove(team)) {
                System.out.println("Team removed");
            }
            
            else {
                System.err.println("Team not removed");
            }
        }
    }
    

    public static void setListOfTeams(Bag<Team> listOfTeams) {
        HW5.listOfTeams = listOfTeams;
    }
    
    public static void display() {
        
        Comparable[] list = listOfTeams.toArray();
        for(int i = 0; i < list.length; i++) {
               System.out.println(list[i]);
           }
    }
    

    //Prints to output.
    public static void generateReport() {
        
        Comparable[] list1 = listOfTeams.toArray();
        
        File file = new File (OUTPUT_FILE);
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println("List of Teams: ");
            pw.println("=============== \n");
            pw.println("\tTeam Name \t\t FirstName \t\t LastName \t"
                    + "PhoneNumb \t Email");

            for (int j = 0; j<list1.length; j++) {
                Team team = (Team) list1[j];
                pw.printf ("%3s \t\t ", team.getTeamName());
                pw.printf ("%3s \t", team.getfName());
                pw.printf ("%3s \t", team.getlName());
                pw.printf ("%3s \t", team.getPhoneNumb());
                pw.printf ("%3s%n", team.getEmail());
                //System.out.println(list1[j]);

            }
            
            pw.flush();
            pw.close();
        }
        catch (FileNotFoundException ex) {
            System.err.println("Error: file not found");
        }

    } // End report.

} // End class.
