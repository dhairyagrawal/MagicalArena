// MagicalArena.java
public class MagicalArena {
    private Player playerA;
    private Player playerB;

    // Constructor to initialize players
    public MagicalArena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    // Method to simulate the game loop
    public void playGame() {
        while (playerA.isAlive() && playerB.isAlive()) {
            // Alternate between players
            playerAttack(playerA, playerB);
            if (playerB.isAlive()) {
                playerAttack(playerB, playerA);
            }
        }

        // Print the winner
        if (playerA.isAlive()) {
            System.out.println("Player A wins!");
        } else {
            System.out.println("Player B wins!");
        }
    }

    // Method to handle the attack phase
    private void playerAttack(Player attacker, Player defender) {
        int damage = attacker.calculateDamage();
        int defense = defender.getStrength() * rollDice();

        int netDamage = Math.max(0, damage - defense); // Ensure damage doesn't go below 0
        defender.receiveDamage(netDamage);

        System.out.println(attacker + " attacks " + defender + " with damage: " + netDamage);
        System.out.println("Player A Health: " + playerA.getHealth() + ", Player B Health: " + playerB.getHealth());
    }

    // Method to simulate rolling a 6-sided die
    private int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        // Example usage
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.playGame();
    }
}
