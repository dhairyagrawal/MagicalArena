// Player.java
public class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;
    private Dice dice;

    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.dice = new Dice();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int calculateDamage() {
        int diceRoll = dice.roll();
        return attack * diceRoll;
    }

    public void receiveDamage(int damage) {
        health = Math.max(0, health - damage);
    }

    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public String toString() {
        return name;
    }
}
