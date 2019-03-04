public class Runner
{
    public static void main(String args[])
    {
        Deck d = new Deck();
        d.loadDeck();
        d.printDeck();

        d.removeCard(51);
        d.printDeck();

        d.removeCard(100);
        d.printDeck();
    }
}