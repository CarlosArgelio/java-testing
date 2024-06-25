package com.testing.javatests.player;

public class Player {

    private Dice dice;
    private int minNumbreToWIn;

    public Player(Dice dice, int minNumbreToWIn) {
        this.dice = dice;
        this.minNumbreToWIn = minNumbreToWIn;
    }

    public boolean play() {
        int diceNumber = dice.roll();
        return diceNumber > minNumbreToWIn;
    }

}
