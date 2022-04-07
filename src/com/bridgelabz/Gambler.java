package com.bridgelabz;
import java.util.Random;

public class Gambler {
    static int stake = 100;
    final static int bet = 1;

    public void game() {
        System.out.println("Every Day Stack: " + stake);
        System.out.println("Bet Price: " + bet);

        int amount=0;
        int won = 0;
        int lost=0;
        int day;
        for (day = 0; day < 20; day++) {
            while (won > (stake/2)  || lost < (stake/2)) {
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
            if (won > (stake/2)) {
                won++;
               // amount = amount + 50;
            } else if (lost < (stake/2)) {
                lost++;
               // amount = amount - 50;
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
