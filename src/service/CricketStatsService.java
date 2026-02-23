package service;

import dao.CricketStatsDao;
import model.CricketStats;

public class CricketStatsService {

    CricketStatsDao dao = new CricketStatsDao();

    public void generateSummary() {

        CricketStats stats = dao.getPlayerStats();

        double average = (double) stats.getRuns() / stats.getMatches();
        double strikeRate = ((double) stats.getRuns() / stats.getBallsFaced()) * 100;

        System.out.println("\n===== CRICKET STAT SUMMARY =====");
        System.out.println("Player Name   : " + stats.getPlayerName());
        System.out.println("Matches       : " + stats.getMatches());
        System.out.println("Runs          : " + stats.getRuns());
        System.out.println("Balls Faced   : " + stats.getBallsFaced());
        System.out.printf("Average       : %.2f%n", average);
        System.out.printf("Strike Rate   : %.2f%n", strikeRate);
        System.out.println("================================");
    }
}