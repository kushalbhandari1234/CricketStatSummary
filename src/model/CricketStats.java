package model;

public class CricketStats {

    private String playerName;
    private int matches;
    private int runs;
    private int ballsFaced;

    public CricketStats(String playerName, int matches, int runs, int ballsFaced) {
        this.playerName = playerName;
        this.matches = matches;
        this.runs = runs;
        this.ballsFaced = ballsFaced;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getMatches() {
        return matches;
    }

    public int getRuns() {
        return runs;
    }

    public int getBallsFaced() {
        return ballsFaced;
    }
}