/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity2;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
                String[] ranks1 = {"Jack", "Queen", "King"};
                String[] suits1 = {"Clubs","Diamonds","Spades"};
                int[] values1 = {11,5,6};
                Deck d1 = new Deck(ranks1, suits1, values1);
                System.out.println("size: " + d1.size());
                
                String[] ranks2 = {"5", "Ace", "10"};
                String[] suits2 = {"Diamonds","Hearts","Clubs"};
                int[] values2 = {3,7,5};
                Deck d2 = new Deck(ranks2, suits2, values2);
                System.out.println(d2.deal());
                
                String[] ranks3 = {"2", "Jack", "8"};
                String[] suits3 = {"Spades","Clubs","Hearts"};
                int[] values3 = {2,6,10};
                Deck d3 = new Deck(ranks3, suits3, values3);
                System.out.println(d3.isEmpty());
	}
}
