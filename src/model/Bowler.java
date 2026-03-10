package model;

public class Bowler {

    String name;
    int matches;
    int wickets;

    public Bowler(String name, int matches, int wickets) {
        this.name = name;
        this.matches = matches;
        this.wickets = wickets;
    }

    public String getName() {
        return name;
    }

    public int getMatches() {
        return matches;
    }

    public int getWickets() {
        return wickets;
    }
}