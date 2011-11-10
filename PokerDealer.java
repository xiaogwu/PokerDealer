/**
 * @author Xiao G. Wu
 * CS111A - Assignment 10
 * @version 1.0 11/04/2011
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

/**
 * This class simulates a poker dealer dealing a hand of 5-card stud.
 */

public class PokerDealer {

    // Constants
    final static int CARDS_IN_DECK = 52;
    final static int CARDS_IN_HAND = 5;
    final static int PLAYERS = 10;
    final static int HANDS = PLAYERS;

    /**
     * Main method
     */

    public static void main(String[] args) {

        // Create an ArrayList for the deck of cards
        ArrayList<Integer> deck = new ArrayList<Integer>();

        // Create 2 Dimensional Array for Players and Cards of each hands
        int[][] players = new int[HANDS][CARDS_IN_HAND];

        // Fill deck with cards
        for (int i = 0; i < CARDS_IN_DECK; i++) {
            deck.add(i);
        }

        // Shuffle deck
        Collections.shuffle(deck);

        // Print deck
        /* System.out.println("Shuffled Deck:"); */
        /* System.out.println(deck); */
        /* System.out.println(); */

        /* 
         * Deal Deck to players.
         * I'm modeling a real world deal by dealing one card to each player
         */
        for (int c = 0; c < CARDS_IN_HAND; c++) {
            for (int h = 0; h < HANDS; h++) {
               players[h][c] = deck.remove(0);
            }
        }

        // Print out hands
        /* System.out.println("Unsorted Hands:"); */
        /* for (int h = 0; h < HANDS; h++) { */
        /*     System.out.print("[ "); */
        /*     for (int c = 0; c < CARDS_IN_HAND; c++) { */
        /*         System.out.printf("%d ", players[h][c]); */
        /*     } */
        /*     System.out.println("]"); */
        /* } */
        /* System.out.println(); */

        // Sort each hand
        for (int h = 0; h < HANDS; h++) {
            Arrays.sort(players[h]);
        }

        // Print out sorted hands
        /* System.out.println("Sorted Hands:"); */
        /* for (int h = 0; h < HANDS; h++) { */
        /*     System.out.print("[ "); */
        /*     for (int c = 0; c < CARDS_IN_HAND; c++) { */
        /*         System.out.printf("%d ", players[h][c]); */
        /*     } */
        /*     System.out.println("]"); */
        /* } */
        /* System.out.println(); */

        // Print out hands in human friendly fashion
        System.out.println("Dealt Hands:");
        for (int h = 0; h < HANDS; h++) {
            System.out.printf("Player-%d: [ ",h+1);
            for (int c = 0; c < CARDS_IN_HAND; c++) {
                if (c == CARDS_IN_HAND - 1) {
                    //System.out.printf(printCard(players[h][c]) + " ");
                    printCard(players[h][c]);
                    System.out.print(" ");
                }
                else {
                    //System.out.printf(printCard(players[h][c]) + ", ");
                    printCard(players[h][c]);
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        System.out.println();

        // Print what's left in deck
        /* System.out.println(deck); */
        System.out.println("Cards remaining in deck:");
        System.out.print("[ ");
        for (int c = 0; c < deck.size(); c++) {
            if (c == deck.size() - 1) {
                printCard(c);
                System.out.print(" ");
            }
            else {
                printCard(c);
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }

    /**
        This method prints the friendly name of the card
    */

    public static void printCard(int card) {
        switch (card) {
            case 0:
                System.out.printf("Duece of Clubs");
                break;
            case 1:
                System.out.printf("Three of Clubs");
                break;
            case 2:
                System.out.printf("Four of Clubs");
                break;
            case 3:
                System.out.printf("Five of Clubs");
                break;
            case 4:
                System.out.printf("Six of Clubs");
                break;
            case 5:
                System.out.printf("Seven of Clubs");
                break;
            case 6:
                System.out.printf("Eight of Clubs");
                break;
            case 7:
                System.out.printf("Nine of Clubs");
                break;
            case 8:
                System.out.printf("Ten of Clubs");
                break;
            case 9:
                System.out.printf("Jack of Clubs");
                break;
            case 10:
                System.out.printf("Queen of Clubs");
                break;
            case 11:
                System.out.printf("King of Clubs");
                break;
            case 12:
                System.out.printf("Ace of Clubs");
                break;
            case 13:
                System.out.printf("Duece of Hearts");
                break;
            case 14:
                System.out.printf("Three of Hearts");
                break;
            case 15:
                System.out.printf("Four of Hearts");
                break;
            case 16:
                System.out.printf("Five of Hearts");
                break;
            case 17:
                System.out.printf("Six of Hearts");
                break;
            case 18:
                System.out.printf("Seven of Hearts");
                break;
            case 19:
                System.out.printf("Eight of Hearts");
                break;
            case 20:
                System.out.printf("Nine of Hearts");
                break;
            case 21:
                System.out.printf("Ten of Hearts");
                break;
            case 22:
                System.out.printf("Jack of Hearts");
                break;
            case 23:
                System.out.printf("Queen of Hearts");
                break;
            case 24:
                System.out.printf("King of Hearts");
                break;
            case 25:
                System.out.printf("Ace of Hearts");
                break;
            case 26:
                System.out.printf("Duece of Diamonds");
                break;
            case 27:
                System.out.printf("Three of Diamonds");
                break;
            case 28:
                System.out.printf("Four of Diamonds");
                break;
            case 29:
                System.out.printf("Five of Diamonds");
                break;
            case 30:
                System.out.printf("Six of Diamonds");
                break;
            case 31:
                System.out.printf("Seven of Diamonds");
                break;
            case 32:
                System.out.printf("Eight of Diamonds");
                break;
            case 33:
                System.out.printf("Nine of Diamonds");
                break;
            case 34:
                System.out.printf("Ten of Diamonds");
                break;
            case 35:
                System.out.printf("Jack of Diamonds");
                break;
            case 36:
                System.out.printf("Queen of Diamonds");
                break;
            case 37:
                System.out.printf("King of Diamonds");
                break;
            case 38:
                System.out.printf("Ace of Diamonds");
                break;
            case 39:
                System.out.printf("Duece of Spades");
                break;
            case 40:
                System.out.printf("Three of Spades");
                break;
            case 41:
                System.out.printf("Four of Spades");
                break;
            case 42:
                System.out.printf("Five of Spades");
                break;
            case 43:
                System.out.printf("Six of Spades");
                break;
            case 44:
                System.out.printf("Seven of Spades");
                break;
            case 45:
                System.out.printf("Eight of Spades");
                break;
            case 46:
                System.out.printf("Nine of Spades");
                break;
            case 47:
                System.out.printf("Ten of Spades");
                break;
            case 48:
                System.out.printf("Jack of Spades");
                break;
            case 49:
                System.out.printf("Queen of Spades");
                break;
            case 50:
                System.out.printf("King of Spades");
                break;
            case 51:
                System.out.printf("Ace of Spades");
                break;
            default:
                System.out.printf("Card not in deck!");
        }
    }
}

