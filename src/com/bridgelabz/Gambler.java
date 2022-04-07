package com.bridgelabz;

public class Gambler {

    public void game() {
        System.out.println("Game Starts");
        int stake=100;
        int bet=1;
        System.out.println("Every Day Stake: "+stake);
        System.out.println("Bet Price: "+bet);
    }

    public static void main(String[] args) {
        Gambler gambling=new Gambler();
        gambling.game();
    }
}
