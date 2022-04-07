package com.bridgelabz;
import java.util.Random;

public class Gambler {
    static int stake=100;
    final static int bet=1;

    public void game() {
        System.out.println("Every Day Stake: "+stake);
        System.out.println("Bet Price: "+bet);

        Random random = new Random();
        int Bet = random.nextInt(2);
        System.out.println("Game Starts");
        int stake=100;
        int bet=1;
        System.out.println("Every Day Stake: "+stake);
        System.out.println("Bet Price: "+bet);
    }

        if(Bet == 1) {
            System.out.println("Bet Win");
        }else {
            System.out.println("Bet Loss");
        }

    }
    public static void main(String[] args) {
        Gambler gambling=new Gambler();
        gambling.game();
    }
}
