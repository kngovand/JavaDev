package hw1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Kevin Ngovanduc - MSU Denver
 */

public class HW1 {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        // TEST SET 1 *******************************************************
        // Test 1a:
            String testID = "2342336";
            String testTeam = "Roosters";
            String testLName= "Dingleberg";
            String testFName= "Rob";
            String testNumb= "303-403-2011";
            String testEmail= "robdingleberg@gmail.com";

            //Creates object to pass to Team constructor
            Team test1 = new Team
                (testID,testTeam,testLName,testFName,testNumb,testEmail);
            System.out.println("TEST SET 1: \n");
            System.out.println("Executing test 1a....");
            test1.toString();

        // Test 1b:
            String testGameID = "103";
            String testID1= "1";
            String testID2= "2";
            String testDate= "20160323";
            int testHScore=2;
            int testGScore=1;

            //Creates object to pass to Game constructor
            Game test2 = new Game
                (testGameID,testID1,testID2,testDate,testHScore,testGScore);

            System.out.println("Executing test 1b....");
            test2.toString();
        
        
        //TEST SET 2*********************************************************
        // Test 2a:
        
            //Inputs file.txt and scans file
            final String INPUT_FILENAME =
                "C:/Users/Kevin/Desktop/hw1input1.txt";
            File file = new File(INPUT_FILENAME);
            Scanner sc = new Scanner(file);

            String data = "";

            while (sc.hasNext()) {
                data += sc.nextLine();
            }
            
            String [] team = data.split(",");

            // Test variables
            testID = team[1];
            testTeam = team[2];
            testLName = team[3];
            testFName = team[4];
            testNumb = team[5];
            testEmail = team[6];
            
            System.out.println("TEST SET 2: \n");
            System.out.println("Executing test 2a....");
            test1.setTeamAttribute(testID, testTeam, testLName,
                                testFName,testNumb, testEmail);
            
        // Test 2b:
            testGameID = team[8];
            testID1 = team[9];
            testID2=team[10];
            testDate= team[11];
            testHScore = Integer.parseInt(team[12]);
            testGScore = Integer.parseInt(team[13]);
            

            System.out.println("Executing test 2b....");
            test2.setGameAttribute(testGameID, testID1, testID2, 
                              testDate, testHScore, testGScore);
            
        //Post-test Checks:
           test1.emailCheck(testEmail);
           test2.dateCheck(testDate);
        
        //TEST SET 3********************************************************* 
        // 3a
            System.out.println("TEST SET 3: \n");
            System.out.println("Executing test 3a....");
            if(!test1.equals(test2)) {
                  System.out.println("Not equal");
        }
        
        // 3b
            System.out.println("Executing test 3b....");
            if(!test2.equals(test1)) {
                  System.out.println("Not equal"); 
            }
    }
    }
    

