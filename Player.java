// Player.java
import java.util.Random;

public class Player {
    private int health;
    private int strength;
    private int attack;

    // Constructor to initialize player attributes
    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    // Getter methods
    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    // Method to check if the player is alive
    public boolean isAlive() {
        return health > 0;
    }

    private final Dice dice;

    // Constructor to initialize player attributes and dice
    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.dice = new Dice();
    }

    // Method to calculate damage inflicted by the player
    public int calculateDamage() {
        int diceRoll = dice.roll();
        return attack * diceRoll;
    }

    // Method to reduce player health based on the damage received
    public void receiveDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0; // Ensure health doesn't go below 0
        }
    }
}
