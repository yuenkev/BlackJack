/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 * @author Kevin Yuen, Ralph Sabio, Jonathan Persaud, Immanuel Georges
 */
public abstract class Card {
    //default modifier for child classes
    
    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
    public enum Suit{
        HEARTS,
        CLUBS,
        SPADES,
        DIAMONDS
    }
    
    public enum Value{
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    }
    
    private Value value;
    private Suit suit;
    
    // Array of suits
    public static final String[] SUITS = 
    {"Hearts", "Diamonds", "Spades", "Clubs"};

    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }
    
    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
    
    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    
    @Override
    public abstract String toString();

}
