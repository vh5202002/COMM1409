import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Desk here.
 *
 * @author (Chiao yu Liang)
 * @version (2018-11-13)
 */
public class Deck
{
    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades","Clubs"};
    public static final String[] DESCRIPTIONS = {"Ace", "Two", "Three", "Four", "Five", "Six", 
    "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    
    private ArrayList<Card> deck; 
    
    /**
     * Constructor for objects of Deck
     */
    public Deck(){
        deck = new ArrayList<Card>();
    }
    
    /**
     * load Deck
     */
    public void loadDeck(){
       for(int i = 0; i < DESCRIPTIONS.length; i++){
           for(int j = 0; j < SUITS.length; j++){
               deck.add(new Card(SUITS[j],DESCRIPTIONS[i]));
            }
        }
    }
 
    /**
     * print Deck
     */
    public void printDeck(){
        for(Card d : deck){
           System.out.println(d.getDescription() + " of " + d.getSuit());
        }
    }
    
    /**
     * remove Card
     */
    public void removeCard(int index){
        if(index >= 0 && index < deck.size()){
            deck.remove(index);
        }
        
    }
    
    /**
     * removeBySuit
     */
    public void removeBySuit(String suit){
        
        Iterator<Card> i = deck.iterator();
        
        while(i.hasNext()){
            
            Card d = i.next();
            
            if(d.getSuit().equals(suit) ){
                i.remove();
            }
            
        }
        
    }
    
}
