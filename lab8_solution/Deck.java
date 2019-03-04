/**
 * Class to model a deck of cards.

 * Lab 8 Solution
 *
 * @author Gary Tong
 * @version 1.0
 */
import java.util.ArrayList;

public class Deck
{
    private ArrayList<Card> deck;

    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    public static final String[] DESCRIPTIONS = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    /**
     * Default ctor instantiates and initializes the deck of cards.
     */
    public Deck()
    {
        this.deck = new ArrayList<Card>();
    }

    /**
     * Populates our deck of cards.
     */
    public void loadDeck()
    {
        for(int i = 0; i < SUITS.length; i++)
        {
            for(int j = 0; j < DESCRIPTIONS.length; j++)
            {
                deck.add(new Card(SUITS[i], DESCRIPTIONS[j]));
            }
        }
    }

    /**
     * Print all cards in the deck.
     */
    public void printDeck()
    {
        for(Card card : deck)
        {
            System.out.println(card.getDescription() + " of " + card.getSuit() + ".");
        }
    }

    /**
     * Remove a card from the deck based on the index.
     *
     * @param index The index of the card to be removed.
     */
    public void removeCard(int index)
    {
        if(index >= 0 && index < deck.size())
        {
            deck.remove(index);
        }
    }
}
