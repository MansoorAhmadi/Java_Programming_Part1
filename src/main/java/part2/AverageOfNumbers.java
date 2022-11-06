package part2;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {

        //Write a program that asks the user for input until the user inputs 0.
        // After this, the program prints the average of the numbers.
        // The number zero does not need to be counted to the average.
        // You may assume that the user inputs at least one number.
        //The average of the numbers can be calculated by dividing the sum of numbers with the amount of the numbers

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double average = 0;

        while (true) {
            int value = Integer.valueOf(scanner.nextInt());
            System.out.println("Give a number:");

            if (value == 0) {
                break;
            }
            sum++;
            average = average + value;
        }

        System.out.println("Average of the numbers: " + average / sum);
    }
}
