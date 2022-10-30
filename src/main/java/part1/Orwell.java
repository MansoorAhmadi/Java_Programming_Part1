package part1;

import java.util.Scanner;

public class Orwell {
    public static void main(String[] args) {

        //Write a program that prompts the user for an integer and prints the string "Orwell" if the number is exactly 1984.

        Scanner scanner = new Scanner(System.in);
        // Write your program here
        System.out.println("Give a number:");
        int value = Integer.valueOf(scanner.nextInt());

        // Indentation becomes serious at this stage. The curly braces must be after the parenthesis.
        if (value == 1984) {
            System.out.println("Orwell");
        }
    }
}
