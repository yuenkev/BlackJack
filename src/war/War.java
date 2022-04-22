/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package war;

/**
 *
 * @author Kevin
 */
public class War extends Game{

    public War(String name) {
        super(name);
    }
    
    public void play() {
        
        System.out.println("Welcome to the game War.");
        System.out.println("Please enter in how many players will be playing.");

    }
    
    public void howToPlay(){
        System.out.println("How to play War: ");
        System.out.println("War is a game similar to BlackJack.");
        System.out.println(" 1) Players are dealt with 2 cards @ beginning");
        System.out.println(" 2) Player's goal is to reach 21 card value. (or close)");
        System.out.println(" 3) Each round, players can ask dealer for a card or hold.");
        System.out.println(" 4) Individuals with a total card value of 21 or closest to that value wins.");
        System.out.println(" 5) IF individual total card value exceeds 21, they LOSE...");
    }

    @Override
    public void declareWinner() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
}
