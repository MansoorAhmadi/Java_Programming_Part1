package part1;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {

        //rite a program that asks the user for three integers and prints their average.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        int num3 = Integer.valueOf(scanner.nextLine());

        double average = 1.0 * (num1 + num2 + num3)  / 3;

        System.out.println("The average is " + average);
    }
}