package part2;

import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {


        //Write a program that reads two integers from the user.
        // If the first number is greater than the second, the program prints "(first) is greater than (second)."
        // If the first number is less than the second, the program prints "(first) is smaller than (second)."
        // Otherwise, the program prints "(first) is equal to (second)."
        // The (first) and (second) should always be replaced with the actual numbers that were provided by the user.

        Scanner scanner = new Scanner(System.in);

        int firstValue = Integer.valueOf(scanner.nextInt());
        int secondValue = Integer.valueOf(scanner.nextInt());

        if (firstValue > secondValue) {
            System.out.println(firstValue + " is greater than " + secondValue + ".");
        } else if (firstValue < secondValue) {
            System.out.println(firstValue + " is smaller than " + secondValue + ".");
        } else {
            System.out.println(firstValue + " is equal to " + secondValue + ".");
        }
    }

}
