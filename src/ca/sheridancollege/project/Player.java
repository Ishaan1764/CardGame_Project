/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;
import java.util.List;
import java.util.ArrayList;
/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Player {

    private String name; //the unique name for this player
    protected List<Card> hand;

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
        this.hand= new ArrayList<>();
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    /**
     * Card received by the player
     * @param card
     */
    
    public void receiveCard(Card card) {
        hand.add(card);
    }
    /**
     * Plays the top card from the player's hand.
     * Typically, this would be the first card, simulating drawing from the top of the deck.
     * @return The card being played.
     */
    
    public Card playCard() {
        if (!hand.isEmpty()) {
            return hand.remove(0); // Remove the first card to simulate playing the top card
        }
        return null;
    }
     /**
     * Checks if the player has any cards left in their hand.
     * @return true if the player has cards, false otherwise.
     */
    public boolean hasCards() {
        return !hand.isEmpty();
    }

    public abstract void play(Game game);

}