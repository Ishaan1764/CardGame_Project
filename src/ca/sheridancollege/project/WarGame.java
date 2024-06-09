/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 * A class to model the "War" card game.
 */
public class WarGame extends Game {
    private GroupOfCards deck;

    public WarGame(String name) {
        super(name);
        initializeDeck();
    }

    private void initializeDeck() {
        // Initialization logic for the deck
    }

    public void dealCards(Player player1, Player player2) {
        // Deal cards to two players
    }

    @Override
    public void play() {
        // Game play logic
    }

    @Override
    public void declareWinner() {
        // Logic to declare the winner
    }
}

