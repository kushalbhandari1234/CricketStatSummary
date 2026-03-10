package service;

import model.Bowler;
import dao.PlayerDao;

import java.util.Scanner;

public class BowlerService {

    PlayerDao dao = new PlayerDao();

    public void addBowler() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bowler Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Matches: ");
        int matches = sc.nextInt();

        System.out.print("Enter Wickets: ");
        int wickets = sc.nextInt();

        Bowler bowler = new Bowler(name, matches, wickets);

        double avg = (double) wickets / matches;

        String data = "Bowler," + bowler.getName() + "," + matches + "," + wickets + ",Avg:" + avg;

        dao.savePlayer(data);

        System.out.println("Bowler saved successfully!");
    }
}