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

    // Method to calculate damage inflicted by the player
    public int calculateDamage() {
        Random rand = new Random();
        int diceRoll = rand.nextInt(6) + 1; // Simulate a 6-sided die roll
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
