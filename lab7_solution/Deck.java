/**
 * Class to model a deck of cards.

 * Lab 7 Solution
 *
 * @author Gary Tong
 * @version 1.0
 */
public class Deck
{
    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    public static final String[] DESCRIPTIONS = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    /**
     * Prints all 52 combinations of a deck of cards.
     */
    public void printDeck()
    {
        for(int i = 0; i < SUITS.length; i++)
        {
            for(int j = 0; j < DESCRIPTIONS.length; j++)
            {
                System.out.println(DESCRIPTIONS[j] + " of " + SUITS[i] + ".");
            }
        }
    }
}

