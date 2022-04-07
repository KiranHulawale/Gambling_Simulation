package com.bridgelabz;
import java.util.Random;

public class Gambler {
    static int stake = 100;
    final static int bet = 1;

    public void game() {
        System.out.println("Every Day Stake: " + stake);
        System.out.println("Bet Price: " + bet);

        int stake_Upper = 150;
        int stake_Lower = 50;

        while (stake > stake_Lower && stake < stake_Upper) {
            Random random = new Random();
            int Bet = random.nextInt(2);
            if (Bet == 1) {
                System.out.println("Bet Win");
                System.out.println("Final Amount: " + (stake += bet));
            } else {
                System.out.println("Bet Loss");
                System.out.println("Final Amount: " + (stake -= bet));
            }
        }


    public static void main(String[] args) {
            Gambler gambling = new Gambler();
            gambling.game();
    }
}
