package hw1;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author Kevin Ngovanduc - MSU Denver
 */

public class Team {
    private String teamID;
    private String teamName;
    private String lastName;
    private String firstName;
    private String phoneNumb;
    private String email;

    public Team() { 
    }
    
    public Team (String teamID, String teamName, String lastName,
                String firstName, String phoneNumb, String email) {
        
        this.teamID = teamID;
        this.teamName = teamName;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumb = phoneNumb;
        this.email = email;
    }

    //TEST 2A
    public static String setTeamAttribute(String teamID, String teamName,
            String lastName, String firstName, String phoneNumb,
            String email) {
        
        String newTeamID = teamID;
        String newTeamName = teamName;
        String newLastName = lastName;
        String newFirstName = firstName;
        String newPhoneNumb = phoneNumb;
        String newEmail = email;
        
        Team test1 = new Team(newTeamID, newTeamName, newLastName,
                            newFirstName, newPhoneNumb, newEmail);
        
        test1.toString();
 
        return newTeamID + newTeamName + newLastName +
                newFirstName + newPhoneNumb + newEmail;
    }
    
    public String getTeamID() {
        return teamID;
    }
    
    public String getTeamName() {
        return teamName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhoneNumb() {
        return phoneNumb;
    }

    public String getEmail() {
        return email;
    }
    
    public boolean validateEmail(String email) {
        if (email.contains("@")) {
            return true;
        }
        else {
            System.err.println("Not a valid email - no @ sign: " + email);
            return false;
        }   
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Team other = (Team) obj;
        if (!Objects.equals(this.teamID, other.teamID)) {
            return false;
        }
        if (!Objects.equals(this.teamName, other.teamName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.phoneNumb, other.phoneNumb)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.teamID);
        hash = 29 * hash + Objects.hashCode(this.teamName);
        hash = 29 * hash + Objects.hashCode(this.lastName);
        hash = 29 * hash + Objects.hashCode(this.firstName);
        hash = 29 * hash + Objects.hashCode(this.phoneNumb);
        hash = 29 * hash + Objects.hashCode(this.email);
        return hash;
    }
    
    @Override
    public String toString() {
        System.out.println( "Team{" + "teamID=" + teamID + ", teamName=" +
                teamName + ", lastName=" + lastName + ", firstName=" + 
                firstName + ", phoneNumb=" + phoneNumb + ", email=" +
                email + '}'+ "\n");
        return "Team{" + "teamID=" + teamID + ", teamName=" + teamName +
                ", lastName=" + lastName + ", firstName=" + firstName +
                ", phoneNumb=" + phoneNumb + ", email=" + email + '}';
    }
        
}
