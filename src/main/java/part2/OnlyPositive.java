package part2;

import java.util.Scanner;

public class OnlyPositive {
    public static void main(String[] args) {

        //Write a program that asks the user for numbers.
        // If the number is negative (smaller than zero), the program prints for user "Unsuitable number" and asks the user for a new number.
        // If the number is zero, the program exits the loop. If the number is positive, the program prints the number to the power of two.

        // The task is to read an input from the user
        Scanner scanner = new Scanner(System.in);

        // The task is to repeat the block until the block is exited
        while (true) {

            // The task is to ask the user for an input
            System.out.println("Give a number:");

            // The task is to read a number from the user
            int number = Integer.valueOf(scanner.nextInt());

            // The task is to guard and prevent unfit numbers
            // for further processing
            if (number < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (number == 0) {
                // The task is to check if the loop should be exited
                break;
            } else {
                // The task is to print the square of the number
                int positiveValue = (int) Math.pow(number, 2);
                System.out.println(positiveValue);
            }
        }

    }
}
