/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;
import java.util.Comparator;
import java.util.Objects;


/**
 *
 * @author Kevin Ngovanduc ~ MSU- Denver <kevinvanduc@gmail.com>
 */
public class Team implements Comparable<Team> {
    
    private String teamID;
    private String teamName;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Computers email;
    
    public Team(String teamID, String teamName, String firstName,
            String lastName, String phoneNumber, String email) {
        
        this.teamID = teamID;
        this.teamName = teamName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    
    //Getters
    public String getTeamID() {
        return teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
    
    
    //Setters
    public void setTeamID(String teamID) {
        this.teamID = teamID;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
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
    
    @Override
    public String toString() {
        return "ProcessTeam{" + "teamID=" + teamID + ", teamName=" + teamName + ","
                + " fName=" + firstName + ", lName=" + lastName + ", phoneNumb=" +
                phoneNumber + ", email=" + email + '}';
    }
    
    
    
} // End class
