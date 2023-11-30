// GameController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/game")
public class GameController {
    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping("/initialize-player")
    public void initializePlayer(@RequestParam String playerName,
                                 @RequestParam int health,
                                 @RequestParam int strength,
                                 @RequestParam int attack) {
        gameService.initializePlayer(playerName, health, strength, attack);
    }

    @PostMapping("/initialize-game")
    public void initializeGame(@RequestParam String player1Name, @RequestParam String player2Name) {
        gameService.initializeGame(player1Name, player2Name);
    }

    @PostMapping("/roll-dice")
    public int rollDice(@RequestParam String playerName) {
        return gameService.rollDice(playerName);
    }

    @GetMapping("/display-game-state")
    public String displayGameState() {
        return gameService.displayGameState();
    }

    @GetMapping("/game-result")
    public String getGameResult() {
        return gameService.getGameResult();
    }
}
