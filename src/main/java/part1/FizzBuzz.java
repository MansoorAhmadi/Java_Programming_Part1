package part1;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        //'Write a program that prompts the user for a number between one and one hundred, and prints that number.
        // If the number is divisible by three, then print "Fizz" instead of the number.
        // If the number is divisible by five, then print "Buzz" instead of the number.
        // If the number is divisible by both three and five, then print "FizzBuzz" instead of the number.'
        //
        //The programmer begins solving the exercise by reading the exercise description and by writing code according to the description.
        // The conditions for execution are presented in a given order by the description,
        // and the initial structure for the program is formed based on that order. The structure is formed based on the following steps:

        //
        //Write a program that reads input from the user.
        //        If the number is divisible by both three and five, then print "FizzBuzz" instead of the number.
        //        If the number is divisible by three, then print "Fizz" instead of the number.
        //        If the number is divisible by five, then print "Buzz" instead of the number.
        //        Otherwise the program prints the number given by the user.

        Scanner reader = new Scanner(System.in);

        int number = Integer.valueOf(reader.nextLine());

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }
}
