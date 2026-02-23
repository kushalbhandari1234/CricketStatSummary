package controller;

import service.CricketStatsService;

public class CricketStatsController {

    CricketStatsService service = new CricketStatsService();

    public void start() {
        service.generateSummary();
    }
}