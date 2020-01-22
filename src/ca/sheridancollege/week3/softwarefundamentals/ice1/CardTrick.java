/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author 
 */
public class CardTrick {
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Random random = new Random();
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);  
            magicHand[i] = c;
        }
        System.out.println("Enter an int representing suit of the card:\n"
                + "0 -Hearts, 1 -Diamonds, 2 -Spades, 3-Clubs");
        int suitQuess = scan.nextInt();
        while(suitQuess < 0 || suitQuess > 3) {
            System.out.println("Number isn't correct (range is 0 - 3)");
            suitQuess = scan.nextInt();
        }
        System.out.println("Enter an int representing value of the card:\n"
                + " range (1 - 13)");
        int valueQuess = scan.nextInt();
        while(valueQuess < 1 || valueQuess > 13) {
            System.out.println("Number isn't correct (range is 1 - 13)");
            valueQuess = scan.nextInt();
        }
        Card quessedCard = new Card();
        quessedCard.setSuit(Card.SUITS[suitQuess]);
        quessedCard.setValue(valueQuess);
        int quess = 0;
        for(Card e: magicHand) {
            if (e.equals(quessedCard)) {
                quess += 1;
            }
        }
        if(quess == 1) {
            System.out.println("You've QUESSED IT RIGHT");
        } else {
            System.out.println("MAY BE NEXT TIME");
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}