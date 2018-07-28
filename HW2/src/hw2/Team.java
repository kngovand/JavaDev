/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

/**
 *
 * @author Kevin Ngovanduc ~ MSU- Denver <kevinvanduc@gmail.com>
 */
public class Team {
        
    private String teamName;
    private String fName;
    private String lName;
    private String phoneNumb;
    private String email;
    
    public Team(String teamName, String fName,
            String lName, String phoneNumb, String email) {
        
        this.teamName = teamName;
        this.fName = fName;
        this.lName = lName;
        this.phoneNumb = phoneNumb;
        this.email = email;
    }
    
    public Team() {
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
    
    public void selectionSort() {
        
    }
    
    public void quickSort() {
    
    }
    
    @Override
    public String toString() {
        return "ProcessTeam{" + ", teamName=" + teamName + ","
                + " fName=" + fName + ", lName=" + lName + ", phoneNumb=" +
                phoneNumb + ", email=" + email + '}';
    }
    

    
}
