/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;

import java.util.Comparator;

/**
 * This is an implementation of Comparator interface. It implements equals
 * and compare methods. It is comparing students by name (last name and first
 * name).
 * @author Salim Lakhani
 * @version 20161018
 * 
 * Edits by Kevin Ngovanduc @MSU_Denver
 */
public class CompByName implements Comparator<Team>{
    
    
    /**
     * This is equals method which test two Student objects for equality.
     * Equality is defined as equality of last name as well as first name.
     * @param left Left student object
     * @param right Right student object
     * @return true if both students have same name (last name as well as first
     * name), else returns false.
     */
    public boolean equals (Team left, Team right)
    {
        boolean result = left.getTeamName().equals(right.getTeamName());
        
        if (result)
        {
            result = left.getTeamName().equals(right.getTeamName());
        }
        
        return result;
    }
    
    /**
     * This is compare method which will compare two students objects using
     * their name (last name and first name).
     * @param left Left student object
     * @param right Right student objects
     * @return It will return 0 if both student objects are equal, it will return
     * a negative number if left is less than right, and it will return a 
     * positive number if left is greater then right.
     */
    public int compare (Team other1, Team other2)
    {
        int result = other1.getTeamName().compareTo(other2.getTeamName());
        
        if (result == 0)
        {
            result = other1.getTeamID().compareTo(other2.getTeamID());
        }
        
        return result;
    }
    
}
