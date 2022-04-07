package com.bridgelabz;
import java.util.Random;

public class Gambler {
    static int stack = 100;
    final static int bet = 1;

    public void game() {
        System.out.println("Every Day Stack: " + stack);
        System.out.println("Beat Price: " + bet);

        int stack_Upper = 150;
        int stack_Lower = 50;

        while (stack > stack_Lower && stack < stack_Upper) {
            Random random = new Random();
            int Bet = random.nextInt(2);
            if (Bet == 1) {
                System.out.println("Bet Win");
                System.out.println("Final Amount: " + (stack += bet));
            } else {
                System.out.println("Bet Loss");
                System.out.println("Final Amount: " + (stack -= bet));
            }
        }
    }

    public static void main(String[] args) {
            Gambler gambling = new Gambler();
            gambling.game();
    }
}
