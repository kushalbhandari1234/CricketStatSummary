package model;

public class Batsman {

    String name;
    int matches;
    int runs;

    public Batsman(String name, int matches, int runs) {
        this.name = name;
        this.matches = matches;
        this.runs = runs;
    }

    public String getName() {
        return name;
    }

    public int getMatches() {
        return matches;
    }

    public int getRuns() {
        return runs;
    }
}