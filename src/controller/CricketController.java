package controller;

import service.BatsmanService;
import service.BowlerService;
import java.util.Scanner;

public class CricketController {

    BatsmanService batsmanService = new BatsmanService();
    BowlerService bowlerService = new BowlerService();

    public void start() {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Cricket Stats Menu =====");
        System.out.println("1. Add Batsman");
        System.out.println("2. Add Bowler");

        int choice = sc.nextInt();

        if (choice == 1) {
            batsmanService.addBatsman();
        } else if (choice == 2) {
            bowlerService.addBowler();
        } else {
            System.out.println("Invalid choice");
        }
    }
}