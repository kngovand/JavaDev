/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Kevin Ngovanduc ~ MSU- Denver <kevinvanduc@gmail.com>
 */
public class HW2 {
    
    private static Bag<Team> listOfTeams;
    private static Bag<Game> listOfGames;
    private static final String INPUT_FILE = "C:/Users/Kevin/Desktop/hw2input1.txt" ;
    private static final String OUTPUT_FILE = "C:/Users/Kevin/Desktop/hw2output1.txt" ;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        listOfTeams = new Bag<Team>(100);
        listOfGames = new Bag<Game>(100);
        
       if(processInput()) {

           generateReport();
       }
          
    }
    
    public static boolean processInput() {
        boolean result = false;
        File file = new File (INPUT_FILE);
        
        try {
            Scanner key = new Scanner(file);
            while(key.hasNext()) {
                String line = key.nextLine();
                String[] info = line.split(",");
                System.out.println(info);
                if(info[0].equals("TEAM")) {
                    processTeam(info);
                }
                else if(info[0].equals("GAME")) {
                    processGame(info);
                }
            }
            
            result = true;
        }
        catch(FileNotFoundException ex) {
            System.err.println("File not found.");
        }
        
        return result;
    }
    
    public static void processTeam(String[] info){
        if(info[1].equals("ADD")) {
            Team team = new Team(info[2], info[3], info[4], info[5], info[6]);
        
            if(!team.validateEmail(info[6])) {
                System.err.println("ERROR EMAIL IS INVALID");
            }

            if(listOfTeams.add(team)) {
                System.err.println("Team added to list.");
            }
            
            else {
                System.err.println("Team not added.");
            }
        
        }
        
        else if(info[1].equals("DEL")) {
            Team team = new Team(info[2], null, null, null, null);  
            
            if(listOfTeams.remove(team)) {
                System.err.println("Team removed");
            }
            
            else {
                System.err.println("Team not removed");
            }
        }
    }
    
    public static void processGame(String[] info){
        if(info[1].equals("ADD")) {
            Game game = new Game(info[2], info[3], info[4],
                    info[5], info[6], info[7]);
        

            if(listOfGames.add(game)) {
                System.err.println("Game added to list.");
            }
            
            else {
                System.err.println("Team not added.");
            }
            
        }
        
        else if(info[1].equals("DEL")) {
            Game game = new Game(info[2], null, null, null, null, null);  
            
            if(listOfGames.remove(game)) {
                System.err.println("Game removed");
            }
            
            else {
                System.err.println("Game not removed");
            }
        
        }
    }
    public static void setListOfTeams(Bag<Team> listOfTeams) {
        HW2.listOfTeams = listOfTeams;
    }

    public static void setListOfGames(Bag<Game> listOfGames) {
        HW2.listOfGames = listOfGames;
    }
    
    public static void generateReport() {
        
        Object[] list1 = listOfGames.toArray();
        Object[] list2 = listOfTeams.toArray();
        
        File file = new File (OUTPUT_FILE);
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println("List of Teams: ");
            pw.println("=============== \n");
            pw.println("\tTeam Name \t\t FirstName \t\t LastName \t"
                    + "PhoneNumb \t Email");

            for (int j = 0; j<list2.length; j++) {
                Team team = (Team) list2[j];
                pw.printf ("%3s \t\t ", team.getTeamName());
                pw.printf ("%3s \t", team.getfName());
                pw.printf ("%3s \t", team.getlName());
                pw.printf ("%3s \t", team.getPhoneNumb());
                pw.printf ("%3s%n", team.getEmail());
                System.out.println(list2[j]);

            }
            pw.println("List of Games: ");
            pw.println("=============== \n");
            pw.println("Game Date \t GameID \t HomeID \t"
                    + "GuestID \t HomeScore \t guestScore");

            for (int j = 0; j<list1.length; j++) {
                Game game = (Game) list1[j];
                pw.printf ("%3s\t ", game.getGameDate());
                pw.printf ("%3s\t\t ", game.getGameID());
                pw.printf ("%3s\t\t ", game.getHomeID());
                pw.printf ("%3s\t\t ", game.getGuestID());
                pw.printf ("%3s\t\t ", game.getHomeScore());
                pw.printf ("%3s\t%n", game.getGuestScore());
                System.out.println(list1[j]);

            }

            
            pw.flush();
            pw.close();
            
            
        }
        catch (FileNotFoundException ex) {
            System.err.println("Error: file not found");
        }

    }

}
