/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.WORLD;

class Card
{
    String rank = null;
    String suit = null;
    public Card(String rank, String suit)
    {
        this.rank = rank;
        this.suit = suit;
    }
    public void print()
    {
        System.out.println(rank + " of " + suit);
    }
};

class Deck
{
    public static String[] allRanks = {"Duece", "Three", "Four", "Five", "Six", "Seven", "Eight", 
        "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    public static String[] allSuits = {"Spades", "Hearts", "Clubs", "Diamonds"};
    
    private Card[] cards = new Card[allRanks.length * allSuits.length];
    public Deck () {
        int i = 0;
        for (String suit : allSuits)
            for (String rank : allRanks)
            {
                cards[i] = new Card(rank, suit);
                i++;
            }
    }
    
    public void print()
    {
        for (Card card: cards)
            card.print();
    }  
};

/**
 *
 * @author Dave
 */
public class cards {
    public static void main(String... args) {
    
        Deck deck = new Deck();
        deck.print();
    
    
     

    }
}

