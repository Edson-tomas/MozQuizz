package com.example.etomas.mozquizz;

public class Ranking {

    private String playerName;
    private int playerPoints;

    public Ranking() {
    }

    public Ranking(String playerName, int playerPoints) {
        this.playerName = playerName;
        this.playerPoints = playerPoints;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public void setPlayerPoints(int playerPoints) {
        this.playerPoints = playerPoints;
    }
}
