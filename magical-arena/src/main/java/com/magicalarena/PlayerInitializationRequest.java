package com.magicalarena;

public class PlayerInitializationRequest {
    private String player1Name;
    private int player1Health;
    private String player2Name;
    private int player2Health;

    // Default constructor for JSON deserialization
    public PlayerInitializationRequest() {
    }

    // Parameterized constructor
    public PlayerInitializationRequest(String player1Name, int player1Health, String player2Name, int player2Health) {
        this.player1Name = player1Name;
        this.player1Health = player1Health;
        this.player2Name = player2Name;
        this.player2Health = player2Health;
    }

    // Getters and setters

    public String getPlayer1Name() {
        return player1Name;
    }

    public void setPlayer1Name(String player1Name) {
        this.player1Name = player1Name;
    }

    public int getPlayer1Health() {
        return player1Health;
    }

    public void setPlayer1Health(int player1Health) {
        this.player1Health = player1Health;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public void setPlayer2Name(String player2Name) {
        this.player2Name = player2Name;
    }

    public int getPlayer2Health() {
        return player2Health;
    }

    public void setPlayer2Health(int player2Health) {
        this.player2Health = player2Health;
    }
}
