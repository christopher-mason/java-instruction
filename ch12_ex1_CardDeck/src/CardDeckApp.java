import java.util.Arrays;
import java.util.ArrayList; //Step 2

public class CardDeckApp {
	
	

    public static void main(String[] args) {
        System.out.println("DECK");
        // String[] deck = getDeck(); // Step 4
        ArrayList<String> deck = getDeck(); // Step 4
        displayCards(deck);

        System.out.println("SHUFFLED DECK");
        shuffleDeck(deck);
        displayCards(deck);

        int count = 2;
        System.out.println("HAND OF " + count + " CARDS");
        // String[] hand = dealCards(deck, count); // Step 7
        ArrayList<String> hand = dealCards(deck, count);
        displayCards(hand);
    }

    private static ArrayList<String> getDeck() {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", 
            "8", "9", "10", "Jack", "Queen", "King"};        

        //String[] deck = new String[52];
        ArrayList<String> deck = new ArrayList<>(52); // Step 3
        //int i = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
               // deck[i] = rank + " of " + suit;
            	String cardStr = rank + " of" + suit;
            	deck.add(cardStr);
                //i++;
            }
        }
        return deck;
    }

    // private static void displayCards(String[] cards) { // Step 5
    private static void displayCards(ArrayList<String> cards) {	 // Step 5
        System.out.print("|");        
        for (String card : cards) {
            System.out.print(card + "|");
        }
        System.out.println();        
    }

    //private static void shuffleDeck(String[] deck) {
    private static void shuffleDeck(ArrayList<String> deck) { // Step 6
    	
    	for (int i = 0; i < deck.size(); ++i) {
    		String savedCard = deck.get(i);
    		int randomIndex = (int) (Math.random() * deck.size() - 1);
    		deck.set(i, deck.get(randomIndex));
    		deck.set(randomIndex, savedCard);
    		
    		
//        for (int i = 0; i < deck.length; i++) {
//            String savedCard = deck[i];
//            int randomIndex = (int) (Math.random() * deck.length-1);
//            deck[i] = deck[randomIndex];
//            deck[randomIndex] = savedCard;
            
//            String save = deck[10]; // Explaining the shuffleDeck() method
//            deck[10] = deck[15];
//            deck[15] = save;
        }
    }

    // private static String[] dealCards(String[] deck, int count) {
    private static ArrayList<String> dealCards(ArrayList<String> deck, int count) { // Step 7
        //String[] hand = Arrays.copyOfRange(deck, 0, count);
    	
    	ArrayList<String> hand = new ArrayList<>();
    	for (int i =0; i < count; ++i) {
    		String topCard = deck.remove(0);
    		hand.add(topCard);
    	}
    	
        return hand;
    }
}