package hw1;
import java.util.Objects;

/**
 * @author Kevin Ngovanduc - MSU Denver
 */

public class Game {
    private String gameID;
    private String homeID;
    private String guestID;
    private String gameDate;
    private int homeScore;
    private int guestScore;
    
    public Game() { 
    }
    
    public Game(String gameID, String homeID, String guestID,
            String gameDate, int homeScore, int guestScore) {
        
        this.gameID = gameID;
        this.homeID = homeID;
        this.guestID = guestID;
        this.gameDate = gameDate;
        this.homeScore = homeScore;
        this.guestScore = guestScore;
    }
    
    //Test 2b
    public static String setGameAttribute(String gameID, String homeID,
            String guestID, String gameDate, int homeScore,
            int guestScore) {
        
        String newGameID = gameID;
        String newHomeID = homeID;
        String newGuestID = guestID;
        String newGameDate = gameDate;
        int newHScore = homeScore;
        int newGScore = guestScore;

        
        Game test1 = new Game(newGameID, newHomeID, newGuestID,
                            newGameDate, newHScore, newGScore);
        
        test1.toString();

 
        return newGameID + newHomeID +newGuestID +
            newGameDate + newHScore + newGScore;
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

    public int getHomeScore() {
        return homeScore;
    }

    public int getGuestScore() {
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
        
        System.out.println("Game{" + "gameID=" + gameID + ", homeID=" + homeID +
                ", guestID=" + guestID + ", gameDate=" + gameDate +
                ", homeScore=" + homeScore + ", guestScore=" + guestScore +
                '}'+ "\n");
        return "Game{" + "gameID=" + gameID + ", homeID=" + homeID +
                ", guestID=" + guestID + ", gameDate=" + gameDate +
                ", homeScore=" + homeScore + ", guestScore=" + guestScore +
                '}';
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
        final Game other = (Game) obj;
        if (this.homeScore != other.homeScore) {
            return false;
        }
        if (this.guestScore != other.guestScore) {
            return false;
        }
        if (!Objects.equals(this.gameID, other.gameID)) {
            return false;
        }
        if (!Objects.equals(this.homeID, other.homeID)) {
            return false;
        }
        if (!Objects.equals(this.guestID, other.guestID)) {
            return false;
        }
        if (!Objects.equals(this.gameDate, other.gameDate)) {
            return false;
        }
        return true;
    }
            
}
