
/**
 * Write a description of class Card here.
 *
 * @author (Chiao yu Liang)
 * @version (2018-11-20)
 */
public class Card
{
    private String suit;
    private String description;
    
    /**
     * Default constructor
     */
    public Card()
    {
        
    }
    
    
    /**
     * Constructor for objects of class Card
     * @param suit to set suit
     * @param description to set description
     */
    public Card(String suit, String description)
    {
        setDescription(description);
        setSuit(suit);
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit){
        this.suit = suit;
    }
    
    /**
     * @return the suit as a String
     */
    public String getSuit(){
        return suit;
    }
    
    /**
     * @param description the description to set
     */
    public void setDescription(String description){
        this.description = description;
    }
    
    /**
     * @return the description 
     */
    public String getDescription(){
        return description;
    }
    
    
    
    
}
