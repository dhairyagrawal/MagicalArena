// Dice.java
import java.util.Random;

public class Dice {
    private final Random random;

    public Dice() {
        this.random = new Random();
    }

    // Method to simulate rolling a 6-sided die
    public int roll() {
        return random.nextInt(6) + 1;
    }
}
