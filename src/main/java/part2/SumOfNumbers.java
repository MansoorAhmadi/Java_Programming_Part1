package part2;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        //Write a program that reads numbers from the user until the user inputs a number 0.
        // After this the program outputs the sum of the numbers.
        // The number zero does not need to be added to the sum, even if it does not change the results.

        Scanner scanner = new Scanner(System.in);

        int result = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextInt());

            result = result + number;
            if (number == 0) {
                break;
            }
        }
        //number of numbers
        System.out.println("Sum of the numbers: " + result);

    }
}
