package service;

import model.Batsman;
import dao.PlayerDao;

import java.util.Scanner;

public class BatsmanService {

    PlayerDao dao = new PlayerDao();

    public void addBatsman() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Batsman Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Matches: ");
        int matches = sc.nextInt();

        System.out.print("Enter Runs: ");
        int runs = sc.nextInt();

        Batsman batsman = new Batsman(name, matches, runs);

        double avg = (double) batsman.getRuns() / batsman.getMatches();

        String data = "Batsman," + batsman.getName() + "," + matches + "," + runs + ",Avg:" + avg;

        dao.savePlayer(data);

        System.out.println("Batsman saved successfully!");
    }
}