// GameService.java
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GameService {
    private Map<String, Player> players = new HashMap<>();
    private MagicalArena magicalArena;

    public void initializePlayer(String playerName, int health, int strength, int attack) {
        Player player = new Player(playerName, health, strength, attack);
        players.put(playerName, player);
    }

    public void initializeGame(String player1Name, String player2Name) {
        Player player1 = players.get(player1Name);
        Player player2 = players.get(player2Name);

        if (player1 != null && player2 != null) {
            magicalArena = new MagicalArena(player1, player2);
        }
    }

    public int rollDice(String playerName) {
        Player player = players.get(playerName);
        return (player != null) ? player.rollDice() : -1;
    }

    public String displayGameState() {
        if (magicalArena != null) {
            return magicalArena.displayGameStatus();
        }
        return "Game not initialized.";
    }

    public String getGameResult() {
        if (magicalArena != null) {
            return magicalArena.getGameResult();
        }
        return "Game not initialized.";
    }
}
