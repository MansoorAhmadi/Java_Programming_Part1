package part2;

import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {

        //Write a program that asks the user for input until the user inputs 0.
        // After this, the program prints the average of the positive numbers (numbers that are greater than zero).
        //
        //If no positive number is inputted, the program prints "Cannot calculate the average"

        Scanner scanner = new Scanner(System.in);

        int input = 0;
        double average = 0;
        int sum = 0;

        while (true) {

            int value = Integer.valueOf(scanner.nextInt());

            if (value > 0) {
                input = input + value;
                sum++;
            } else {
                if (value < 0) {
                    continue;
                }
                System.out.println("Cannot calculate the average");
                break;
            }

        }
        average = average + input;
        System.out.println(average/sum);

    }
}
