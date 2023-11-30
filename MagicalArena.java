import java.util.Scanner;

public class MagicalArena {
    private Player player1;
    private Player player2;
    private Dice dice;

    public MagicalArena() {
        this.dice = new Dice();
    }

    public void initializePlayers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Player 1 name:");
        String player1Name = scanner.nextLine();
        System.out.println("Enter Player 1 health:");
        int player1Health = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter Player 2 name:");
        String player2Name = scanner.nextLine();
        System.out.println("Enter Player 2 health:");
        int player2Health = scanner.nextInt();

        player1 = new Player(player1Name, player1Health, 5, 10);
        player2 = new Player(player2Name, player2Health, 10, 5);
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (player1.isAlive() && player2.isAlive()) {
            printPlayers();
            printGameStatus();

            // Player 1's turn
            playerTurn(player1, player2, scanner);

            // Check if Player 2 is still alive before their turn
            if (player2.isAlive()) {
                printPlayers();
                printGameStatus();

                // Player 2's turn
                playerTurn(player2, player1, scanner);
            }
        }

        scanner.close();
        printGameResult();
    }

    private void printPlayers() {
        System.out.println(player1.getName() + " - Health: " + player1.getHealth());
        System.out.println(player2.getName() + " - Health: " + player2.getHealth());
        System.out.println("---------------");
    }

    private void printGameStatus() {
        System.out.println("Game Status:");
        System.out.println("---------------");
    }

    private void playerTurn(Player attacker, Player defender, Scanner scanner) {
        System.out.println(attacker.getName() + "'s turn.");
        System.out.println("Press Enter to roll the dice.");
        scanner.nextLine();

        int diceRoll = dice.roll();
        int damage = attacker.calculateDamage();

        System.out.println(attacker.getName() + " rolled a " + diceRoll + " on the dice.");
        System.out.println("Attack damage: " + damage);

        int defense = defender.getStrength() * dice.roll();
        int netDamage = Math.max(0, damage - defense);

        System.out.println(defender.getName() + " rolled a " + diceRoll + " on the defense dice.");
        System.out.println(defender.getName() + "'s defense: " + defense);
        System.out.println(attacker.getName() + "'s net damage: " + netDamage);

        defender.receiveDamage(netDamage);
    }

    private void printGameResult() {
        System.out.println("---------------");
        if (!player1.isAlive() && !player2.isAlive()) {
            System.out.println("It's a tie!");
        } else if (!player1.isAlive()) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println(player1.getName() + " wins!");
        }
    }

    public static void main(String[] args) {
        MagicalArena arena = new MagicalArena();
        arena.initializePlayers();
        arena.playGame();
    }

    public String displayGameStatus() {
        StringBuilder status = new StringBuilder();
        status.append("Game Status:\n");
        status.append("---------------\n");
        status.append("Player 1: ").append(player1.getName()).append(" - Health: ").append(player1.getHealth()).append("\n");
        status.append("Player 2: ").append(player2.getName()).append(" - Health: ").append(player2.getHealth()).append("\n");
        status.append("---------------\n");
        return status.toString();
    }

    public String getGameResult() {
        if (!player1.isAlive() && !player2.isAlive()) {
            return "It's a tie!";
        } else if (!player1.isAlive()) {
            return player2.getName() + " wins!";
        } else {
            return player1.getName() + " wins!";
        }
    }
}
