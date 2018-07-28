/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//TODO LIST: COMPARATOR(compare team ids), SORT METHOD
package hw6;
import java.io.*;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Kevin Ngovanduc ~ MSU- Denver <kevinvanduc@gmail.com>
 */
public class HW6 {
    
    private static List<Team> listOfTeams;
    private static final String INPUT_FILE = "C:/Users/Kevin/Desktop/hw6input.txt" ;
    private static final String OUTPUT_FILE = "C:/Users/Kevin/Desktop/hw2output.txt" ;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            listOfTeams = new List<Team>(100);
            
        System.out.println("Hello user. " +"\n" + 
                "This program takes an input file that contains teams," +
                " processes them into a sorted list, " + "\n" +
                "and prints them to an output file." + "\n");

            processInput();
            generateReport();
            
    } // End main method
    
    
    public static boolean processInput() {
        
        File file = new File(INPUT_FILE);

        boolean result = false;
   
        try {
            Scanner key = new Scanner(file);
            
            while(key.hasNext()) {
                String line = key.nextLine();
                String[] info = line.split(",");
               
                if(info[0].equals("TEAM")) {    
                    processTeamData(info);
                }
                
                result = true;
            } // End while
        }
        
        catch(FileNotFoundException ex) {
            System.out.println("File not found");
        }
      
        return result;
    } // End class


    private static void processTeamData(String[] info) {
        Team team;
        if(info[1].equals("ADD")) {
            team = new Team (info[2], info[3], info[4], 
                            info[5], info[6], info[7]);
        
        listOfTeams.add(team);
        }
        
        else if(info[1].equals("DEL")) {
            team = new Team(info[2], null, null,
                                null, null, null);
            
            listOfTeams.remove(team);
                                                           
        }
        
        else {
            System.err.println("Did not work");
        }
        
    }
    

    public static void generateReport() {
        
        Comparable[] list1 = listOfTeams.toArray();
        
        File file = new File (OUTPUT_FILE);
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println("List of Teams: ");
            pw.println("=============== \n");
            pw.println("\tTeam Name \t\t FirstName \t\t LastName \t"
                    + "PhoneNumb \t Email");
            
            
            System.out.println("To output file:");

            for (int j = 0; j<list1.length; j++) {
                Team team = (Team) list1[j];
                pw.printf ("%3s \t\t ", team.getTeamName());
                pw.printf ("%3s \t", team.getFirstName());
                pw.printf ("%3s \t", team.getLastName());
                pw.printf ("%3s \t", team.getPhoneNumber());
                pw.printf ("%3s%n", team.getEmail());
                System.out.println(team.toString());

            }
            
            pw.flush();
            pw.close();
        }
        catch (FileNotFoundException ex) {
            System.err.println("Error: file not found");
        }

    }

    
} // End main class
