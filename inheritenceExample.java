/*Write a simple java application that creates a Player class. 
Inherit CricketPlayer class from Player class. Inherit Batsman & Bowler classes from CricketPlayer class. 
Assume suitable data and member methods.*/

import java.util.*;

class Player {

    String name;
    String country;
    int age;
    int player_id;
    
    Player() {

        name = "";
        country = "";
        age = 0;
        player_id = 0;    
    }

    void getPlayerData() {
        Scanner s = new Scanner(System.in);
        System.out.println("\nGetting player details.........");
        System.out.print("Enter player name: ");
        this.name = s.nextLine();
        System.out.print("Enter player nationality: ");
        this.country = s.next();
        System.out.print("Enter player age: ");
        this.age = s.nextInt();
        System.out.print("Enter player id: ");
        this.player_id = s.nextInt();
    }

    void showPlayerData() {
        System.out.println("\nShowing player details.........");
        System.out.println("Player name: " + this.name);
        System.out.println("Player nationality: " + this.country);
        System.out.println("Player age: " + this.age);
        System.out.println("Player id: " + this.player_id);
    }

}

class CricketPlayer extends Player {

    int matches;
    String player_type;

    CricketPlayer() {
        super();
        matches = 0;
        player_type = "";
    }

    void getCricketPlayerData() {
        System.out.println("\nGetting cricket player details.........");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of matches: ");
        this.matches = s.nextInt();
        s.nextLine();
        System.out.print("Enter player type: ");
        this.player_type = s.nextLine();
    }

    void showCricketPlayerData() {
        System.out.println("\nShowing cricket player details.........");
        System.out.println("Number of matches: " + this.matches);
        System.out.println("Type of player: " + this.player_type);
    }

}

class Batsman extends CricketPlayer {
    
    int runs;
    double avg;
    double strike_rate;
    int fifties;
    int hundreds;
    int best_score;

    Batsman() {
        super();
        runs = 0;
        avg = 0.0;
        strike_rate = 0.0;
        fifties = 0;
        hundreds = 0;
        best_score = 0;
    }

    void getBatsmanData() {
        System.out.println("\nGetting batsman details.........");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter runs scored: ");
        this.runs = s.nextInt();
        System.out.print("Enter average: ");
        this.avg = s.nextDouble();
        System.out.print("Enter strike rate: ");
        this.strike_rate = s.nextDouble();
        System.out.print("Enter number of fifties: ");
        this.fifties = s.nextInt();
        System.out.print("Enter number of hundreds: ");
        this.hundreds = s.nextInt();
        System.out.print("Enter best score: ");
        this.best_score = s.nextInt();
    }

    void showBatsmanData() {
        System.out.println("\nShowing batsman details.........");
        System.out.println("Runs scored: " + this.runs);
        System.out.println("Average of batsman: " + this.avg);
        System.out.println("Strike rate of batsman: " + this.strike_rate);
        System.out.println("Number of fifties: " + this.fifties);
        System.out.println("Number of hundreds: " + this.hundreds);
        System.out.println("Best score: " + this.best_score);
    }
}

class Bowler extends CricketPlayer {
    
    String bowler_type;
    int wickets;
    double economy;

    Bowler() {
        super();
        bowler_type = "";
        wickets = 0;
        economy = 0.0;
    }

    void getBowlerData() {
        System.out.println("\nGetting bowler details.........");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter bowler type: ");
        this.bowler_type = s.nextLine();
        System.out.print("Enter wickets taken: ");
        this.wickets = s.nextInt();
        System.out.print("Enter economy: ");
        this.economy = s.nextDouble();
    }

    void showBowlerData() {
        System.out.println("\nShowing player details.........");
        System.out.println("Bowler type: " + this.bowler_type);
        System.out.println("Wickets taken: " + this.wickets);
        System.out.println("Bowler's economy: " + this.economy);
    }
}

public class inheritenceExample {
    
    public static void main(String[] args) {
       
        // creating Player object, getting and displaying data
        Player player1 = new Player();
        player1.getPlayerData();
        player1.showPlayerData();

        // creating Cricket Player object, getting and displaying data
        CricketPlayer cricplayer1 = new CricketPlayer();
        cricplayer1.getCricketPlayerData();
        cricplayer1.showCricketPlayerData();

        // creating Batsman object, getting and displaying data
        Batsman batsman1 = new Batsman();
        batsman1.getBatsmanData();
        batsman1.showBatsmanData();

        // creating Bowler object, getting and displaying data
        Bowler bowler1 = new Bowler();
        bowler1.getBowlerData();
        bowler1.showBowlerData();
    }
}
