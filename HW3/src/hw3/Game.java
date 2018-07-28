/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

/**
 *
 * @author Kevin Ngovanduc ~ MSU- Denver <kevinvanduc@gmail.com>
 */
public class Game {
       
    private String gameID;
    private String homeID;
    private String guestID;
    private String gameDate;
    private String homeScore;
    private String guestScore;
    
    public Game(String gameID, String homeID, String guestID,
            String gameDate, String homeScore, String guestScore) {
        
        this.gameID = gameID;
        this.homeID = homeID;
        this.guestID = guestID;
        this.gameDate = gameDate;
        this.homeScore = homeScore;
        this.guestScore = guestScore;
    }
    
    public Game() {
    }

    public String getGameID() {
        return gameID;
    }

    public String getHomeID() {
        return homeID;
    }

    public String getGuestID() {
        return guestID;
    }

    public String getGameDate() {
        return gameDate;
    }

    public String getHomeScore() {
        return homeScore;
    }

    public String getGuestScore() {
        return guestScore;
    }
    
    public boolean dateCheck(String gameDate) {
        int dateConverted = Integer.parseInt(gameDate);
        if (dateConverted >= 20160101 && dateConverted <= 20160531) {
                return true;
        }
            else {
                System.err.println("Date invalid!"
                        + " Date entered: " + dateConverted);
                return false;
            }
        }

    @Override
    public String toString() {
        return "Game{" + "gameID=" + gameID + ", homeID=" + homeID +
                ", guestID=" + guestID + ", gameDate=" + gameDate +
                ", homeScore=" + homeScore + ", guestScore=" + guestScore 
                + '}' + "\n";
    }
}
