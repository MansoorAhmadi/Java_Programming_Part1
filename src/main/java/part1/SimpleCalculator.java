package part1;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        //Write a program that asks the user for two numbers and prints their
        //  *sum,
        //  *difference,
        //  *product,
        //  *and quotient.
        // Two examples of the execution of the program are given below.

        //Give the first number:
        //8
        //Give the second number:
        //2
        //8 + 2 = 10
        //8 - 2 = 6
        //8 * 2 = 16
        //8 / 2 = 4.0

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        float division = (float) first / second;

        System.out.println(first + " + " + second + " = " + (first + second));
        System.out.println(first + " - " + second + " = " + (first - second));
        System.out.println(first + " * " + second + " = " + (first * second));
        System.out.println(first + " / " + second + " = " + division);
    }
}
