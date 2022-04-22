/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package war;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public class Card {
    //default modifier for child classes
    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
    String suit;
    String rank; 
    
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
    "Jack", "Queen", "King"};    

    public Card(int n1, int n2) {
        setSuit(n1);
        setRank(n2);
    }
    
    
    public String getSuit() {
        return suit;
    }

    public void setSuit(int num) {
        this.suit = suits[num];
    }

    public String getRank() {
        return rank;
    }

    public void setRank(int num) {
        this.rank = ranks[num];
    }
}
    

