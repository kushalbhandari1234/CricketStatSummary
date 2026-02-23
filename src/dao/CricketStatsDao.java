package dao;

import model.CricketStats;
import utils.InputUtil;

public class CricketStatsDao {

    public CricketStats getPlayerStats() {

        String name = InputUtil.readString("Enter Player Name: ");
        int matches = InputUtil.readInt("Enter Matches Played: ");
        int runs = InputUtil.readInt("Enter Total Runs: ");
        int balls = InputUtil.readInt("Enter Balls Faced: ");

        return new CricketStats(name, matches, runs, balls);
    }
}