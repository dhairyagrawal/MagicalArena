package com.magicalarena.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.magicalarena.MagicalArena;
import com.magicalarena.PlayerInitializationRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api/magical-arena")
@CrossOrigin(origins = "http://localhost:3000") 
public class GameController {

    private final MagicalArena magicalArena;

    @Autowired
    public GameController(MagicalArena magicalArena) {
        this.magicalArena = magicalArena;
    }

    @PostMapping("/initialize-players")
    public String initializePlayers(@RequestBody PlayerInitializationRequest request) {
        magicalArena.initializePlayers(request.getPlayer1Name(), request.getPlayer1Health(), request.getPlayer2Name(), request.getPlayer2Health());
        return "Players initialized successfully.";
    }

    @GetMapping("/status")
    public String getGameStatus() {
        return magicalArena.getGameStatus();
    }

    @GetMapping("/players-info")
    public String getPlayersInfo() {
        return magicalArena.printPlayers();
    }
}