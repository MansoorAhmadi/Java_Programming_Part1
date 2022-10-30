package part1;

import java.util.Scanner;

public class MultiplicationFormula {
    public static void main(String[] args) {

        //Similar to the previous exercise, create a program that multiplies the values stored in two integer variables.
        //
        //For instance, if the entered numbers are 2 and 8, the program should print the following:

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println(first + " * " + second + " = " + (first * second));
    }
}
