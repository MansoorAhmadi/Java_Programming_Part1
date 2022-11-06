package part2;

import java.util.Scanner;

public class NumberAndSumOfNumbers {
    public static void main(String[] args) {

        //Write a program that asks the user for input until the user inputs 0.
        // After this the program prints the amount of numbers inputted and the sum of the numbers.
        // The number zero does not need to be added to the sum, but adding it does not change the results.
        //
        //You need two variables to keep track of the information.
        // Use one for keeping track of the numbers inputted and other for keeping track of the sum

        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;
        int numberOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextInt());

            if (number == 0) {
                break;
            }

            numberOfNumbers++;
            sumOfNumbers = sumOfNumbers + number;

        }
        //number of numbers & sum of numbers
        System.out.println("Number of numbers: " + numberOfNumbers);
        System.out.println("Sum of the numbers: " + sumOfNumbers);

    }
}
