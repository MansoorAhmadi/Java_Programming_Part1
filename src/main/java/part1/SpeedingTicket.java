package part1;

import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String[] args) {

        //Write a program that asks the user for an integer and prints the string "Speeding ticket!" if the input is greater than 120.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give speed:");
        int value = Integer.valueOf(scanner.nextInt());

        if (value > 120) System.out.println("Speeding ticket!");

        scanner.close();

    }
}
