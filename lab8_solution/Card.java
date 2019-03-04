/**
 * Class to model a card in a deck.

 * Lab 8 Solution
 *
 * @author Gary Tong
 * @version 1.0
 */

public class Card
{
    private String suit;
    private String description;

    /**
     * Default ctor.
     */
    public Card(){}

    /**
     * Constructor takes in both suit and description
     *
     * @param suit The card suit.
     * @param description The card description.
     */
    public Card(String suit, String description)
    {
        this.suit        = suit;
        this.description = description;
    }

    /**
     * Returns the current suit.
     *
     * @return The suit.
     */
    public String getSuit()
    {
        return this.suit;
    }

    /**
     * Returns the current description.
     *
     * @return The description.
     */
    public String getDescription()
    {
        return this.description;
    }

    /**
     * Sets a new suit for the card.
     *
     * @param suit The suit.
     */
    public void setSuit(String suit)
    {
        this.suit = suit;
    }

    /**
     * Sets a new description of the Card.
     *
     * @param descrition The description.
     */
    public void setDescription(String description)
    {
        this.description = description;
    }
}