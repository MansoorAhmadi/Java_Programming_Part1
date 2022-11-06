package part2;

import java.util.Scanner;

public class NumberOfNumbers {
    public static void main(String[] args) {

        //Write a program that reads values from the user until they input a 0.
        // After this, the program prints the total number of inputted values.
        // The zero that's used to exit the loop should not be included in the total number count.
        //
        //Example output of the program:

        Scanner scanner = new Scanner(System.in);

        int result = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextInt());

            if (number == 0) {
                 break;
            }
             result++;
        }
        System.out.println("Number of numbers: " + result);
    }
}
