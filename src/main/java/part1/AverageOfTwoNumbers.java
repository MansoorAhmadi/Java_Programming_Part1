package part1;

import java.util.Scanner;

public class AverageOfTwoNumbers {
    public static void main(String[] args) {

        //EXERCISE
//        Write a program that asks the user for two integers and prints their average.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());

        double average = 1.0 * (num1 + num2)  / 2;

        System.out.println("The average is " + average);



        //PRACTICES
        int first = 3;
        int second = 2;

        //store the division in a double
        double results = first / second;
//        System.out.println(results);


        double whenDividendIsFloat = 3.0 / 2;
        System.out.println(whenDividendIsFloat); // prints 1.5

        double whenDivisorIsFloat = 3 / 2.0;
        System.out.println(whenDivisorIsFloat); // prints 1.5



        int dividend = 3;
        int divisor = 2;

        // 1.0 * 3 / 2 = 1.5
        double result = 1.0 * dividend / divisor;
//        System.out.println(result);


    }
}
