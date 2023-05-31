package com.example.helloworld.models;

public class PlayerModel {

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getFour() {
        return four;
    }

    public void setFour(int four) {
        this.four = four;
    }

    public int getSixes() {
        return sixes;
    }

    public void setSixes(int sixes) {
        this.sixes = sixes;
    }

    public int getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(int strikeRate) {
        this.strikeRate = strikeRate;
    }

    String playerName;
    int run;
    int balls;
    int four;
    int sixes;
    int strikeRate;
}
