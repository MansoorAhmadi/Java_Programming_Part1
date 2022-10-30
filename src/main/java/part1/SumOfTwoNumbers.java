package part1;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        //Write a program that asks the user for two numbers. After this, the program prints the sum of the numbers given by the user.
        //
        //When you ask for multiple numbers, create a separate variable for each:

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second));
    }
}
