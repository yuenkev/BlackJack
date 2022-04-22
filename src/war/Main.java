/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package war;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Main {
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       War game = new War("War");
       
       //intro prompt
       game.play();
       int numOfPlayers = sc.nextInt();
       System.out.println();
       
       //prompt for player names
       ArrayList<String> names = new ArrayList<>();// the players of the game
       
       for(int i = 0; i < numOfPlayers; i++){
           System.out.println("Please enter the name of player " + (i+1) + ": ");
           String name = sc.next();
           names.add(name);
       }
        
       game.setPlayers(names);
       
       //rules of the game
       System.out.println();
       game.howToPlay();
       
       //deal cards
       GroupOfCards goc = new GroupOfCards(52);

       
       ArrayList<Card> cards = new ArrayList<Card>();
       
       
       for (int i = 0; i < (game.getPlayers()).size(); i++){
           
           System.out.println();
           int rn1 = (int)(Math.random() * 4);
           int rn2 = (int)(Math.random() * 13);
           
           int rn3 = (int)(Math.random() * 4);
           int rn4 = (int)(Math.random() * 13);
           System.out.println("Player " + ((game.getPlayers()).get(i)).getName() + ": You are dealt with...");
           Card card1 = new Card(rn1, rn2);
           Card card2 = new Card(rn3, rn4);
           
           System.out.println(card1.getSuit() +  " " + card1.getRank());
           System.out.println(card2.getSuit() +  " " + card2.getRank());
          
           int c1Total = 0;
           int c2Total = 0;
           
           //getting total value
           if((card1.getRank()).equals("King") || (card1.getRank()).equals("Queen") || (card1.getRank()).equals("Jack")){
               c1Total += 10;
           } else {
               c1Total += Integer.parseInt(card1.getRank());
           }
           
           if((card2.getRank()).equals("King") || (card2.getRank()).equals("Queen") || (card2.getRank()).equals("Jack")){
               c2Total += 10;
           } else {
               c2Total += Integer.parseInt(card2.getRank());
           }
           
           int cTotal = c1Total + c2Total;
          
            ((game.getPlayers()).get(i)).setCardValue(cTotal);
            System.out.println("Your total value is: " + cTotal + ".");
            System.out.println();
            
            
            //Add a card or stay.
            char stayOrPlay = 'N';
            
            System.out.println("Would you like to add another card? (Y/N)");
            stayOrPlay = sc.next().charAt(0);
            
            while(stayOrPlay == 'Y' || stayOrPlay == 'y'){
                
                int rn5 = (int)(Math.random() * 4);
                int rn6 = (int)(Math.random() * 13);
                System.out.println("Player " + ((game.getPlayers()).get(i)).getName() + ": You are dealt with...");
                Card card3 = new Card(rn5, rn6);
                System.out.println(card3.getSuit() +  " " + card3.getRank());
                              
                if((card3.getRank()).equals("King") || (card3.getRank()).equals("Queen") || (card3.getRank()).equals("Jack")){
                    cTotal += 10;
                } else {
                    cTotal += Integer.parseInt(card3.getRank());
                }
                
                //set value
                ((game.getPlayers()).get(i)).setCardValue(cTotal);
                
                if(cTotal > 21){
                    System.out.println("Your total value is: " + cTotal + ".");
                    System.out.println("");
                    System.out.println("You Lose...");

                    break;
                } else {
                    
                    System.out.println("Your total value is: " + cTotal + ".");
                    System.out.println();
                    System.out.println("Would you like to add another card? (Y/N)");
                    stayOrPlay = sc.next().charAt(0);
                }
                
            }  //end of while
            
            System.out.println("-------------------------------------------");
            
        } // end of for loop

       
       
        int[] validNumbers = new int[(game.getPlayers()).size()];
        //comparing cards
        for (int k = 0 ; k < (game.getPlayers()).size(); k++){
           
           if(((game.getPlayers()).get(k)).getCardValue() > 21) {
               validNumbers[k] = 0;
           } else {
               validNumbers[k] = ((game.getPlayers()).get(k)).getCardValue();
           }
        } //end of for loop for making new array
        
        
        int winnerIndex = 0;
        int highestCard = 0;
        
        for(int r = 0; r < validNumbers.length; r++){
            
            if(validNumbers[r] > highestCard){
                winnerIndex = r;
            }
        }
        
        System.out.println("");
        System.out.println("The winner is " + 
                ((game.getPlayers()).get(winnerIndex)).getName() + " with a "
                        + "total card value of " +
                (((game.getPlayers()).get(winnerIndex)).getCardValue()) 
                + ".");
     
    }//main method end
       
       
}// clas end

    
