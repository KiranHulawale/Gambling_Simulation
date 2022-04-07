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

        int amount=0;
        int won = 0;
        int lost=0;
        int day;
        for (day = 0; day < 20; day++) {
            while (stake > stake_Upper  && stake < stake_Lower) {
                Random random = new Random();
                int Bet = random.nextInt(2);
                if (Bet  == bet) {
                    won++;
                    stake++;
                } else if (Bet == 0) {
                    lost++;
                    stake--;
                }
            }
            if (stake > stake_Upper) {
                won++;
                amount = amount + 50;
            } else if (stake < stake_Upper) {
                lost++;
                amount = amount - 50;
            }
        }
        if (won > lost) {
            System.out.println("After " + day + " days the total amount won is: " + amount);
        } else if (lost > won) {
            System.out.println("After " + day + " days the total amount lost is: " + amount);
        } else System.out.println("neither win or lost");
    }

    public static void main(String[] args) {
            Gambler gambling = new Gambler();
            gambling.game();
    }
}
