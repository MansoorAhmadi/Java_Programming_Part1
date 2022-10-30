package part1;

import java.util.Scanner;

public class LargerThanOrEqualTo {
    public static void main(String[] args) {
        //Write a program that prompts the user for two integers and prints the larger of the two.
        // If the numbers are the same, then the program informs us about this as well.

        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scan.nextInt());

        System.out.println("Give the first number:");
        int secondNumber = Integer.valueOf(scan.nextInt());

        if (firstNumber > secondNumber) {
            System.out.println("Greater number is: " + firstNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println("Greater number is: " + secondNumber);
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}
