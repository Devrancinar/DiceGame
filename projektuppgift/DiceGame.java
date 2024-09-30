package se.devran.projektuppgift;

import java.util.Scanner;
import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {

        Välkommen("Hej och välkommen till tärningsspelet!", "Fyll gärna in erat namn för att sätta igång spelet!", "Den som får högst poäng på sina tärningsslag vinner");

        Scanner scanner = new Scanner(System.in);

        Player player1 = getPlayer(scanner, "Namn för spelare 1: ");
        Player player2 = getPlayer(scanner, "Namn för spelare 2: ");

        Random random = new Random();

        int total1 = getTotal(random, player1);
        int total2 = getTotal(random, player2);

        totala(player1, total1, player2, total2);

        calculateWinner(total1, total2, player1, player2);

        scanner.close();


    }

    private static Player getPlayer(Scanner scanner, String message) {
        System.out.println(message);
        Player player = new Player(scanner.nextLine());
        return player;
    }

    private static void Välkommen(String x, String x1, String x2) {
        System.out.println(x);
        System.out.println(x2);
        System.out.println(x1);
    }

    private static void totala(Player player1, int total, Player player2, int total2) {
        System.out.println("\nResultat:");
        System.out.println(player1.getName() + " fick totalt: " + total);
        delay(1000);
        System.out.println(player2.getName() + " fick totalt: " + total2 + "\n");
        delay(1000);
    }

    private static int getTotal(Random random, Player player1) {
        int roll1 = random.nextInt(6) + 1;
        System.out.println(player1.getName() + "s Första kast: " + roll1);
        delay(1000);
        int roll2 = random.nextInt(6) + 1;
        delay(1000);
        System.out.println(player1.getName() + "s andra kast: " + roll2);
        delay(1000);
        int total = roll1 + roll2;
        System.out.println(player1.getName() + " kastade: " + total + "\n");
        delay(2000);
        return total;
    }

    private static void calculateWinner(int total, int total2, Player player1, Player player2) {
        if (total > total2) {
            System.out.println(player1.getName() + " vinner!");
        }

        else if (total2 > total) {
            System.out.println(player2.getName() + " vinner!");
        }

        else {
            System.out.println("Resultatet blev oavgjort!");
        }
    }

    private static void delay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
