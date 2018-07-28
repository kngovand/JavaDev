/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;

import java.util.Comparator;
import java.util.Objects;
/**
 *
 * @author Kevin Ngovanduc ~ MSU- Denver <kevinvanduc@gmail.com>
 */
public class Team implements Comparable<Team> {
    
    private String teamID;
    private String teamName;
    private String fName;
    private String lName;
    private String phoneNumb;
    private String email;
    
    public Team(String teamID, String teamName, String fName,
            String lName, String phoneNumb, String email) {
        
        this.teamID = teamID;
        this.teamName = teamName;
        this.fName = fName;
        this.lName = lName;
        this.phoneNumb = phoneNumb;
        this.email = email;
    }
    
    public Team() {
    }

    public String getTeamID() {
        return teamID;
    }
    
    public String getTeamName() {
        return teamName;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getPhoneNumb() {
        return phoneNumb;
    }

    public String getEmail() {
        return email;
    }
    
    public boolean validateEmail(String email) {
        boolean result = false;
        if (email.contains("@")) {
            result = true;
        }
        else {
            result = false;
        }   
        
        return result;
    }
    
    @Override
    public String toString() {
        return "ProcessTeam{" + "teamID=" + teamID + ", teamName=" + teamName + ","
                + " fName=" + fName + ", lName=" + lName + ", phoneNumb=" +
                phoneNumb + ", email=" + email + '}';
    }

  
    public int compareTo(Team o) {

        int result = 0;
        
        int thisStudentId = Integer.parseInt(this.teamID);
        int otherStudentId = Integer.parseInt(o.teamID);
        
       //result = this.teamID.compareTo(o.teamID);
        result = thisStudentId - otherStudentId;
        
        
        return result;
    }
    
    public int compareTo2 (Team other)
    {
        int result = 0;
        
        result = this.teamID.compareTo(other.teamID);
        
        if (result == 0)
        {
            result = this.teamID.compareTo(other.teamID);
        }
        
        
        return result;
    }
}
    

