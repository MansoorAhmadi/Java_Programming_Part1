package part1;

import java.util.Scanner;

public class AdditionFormula {
    public static void main(String[] args) {

//        Create a program that can be used to add two integers together.
//        In the beginning, the user is asked to give two integers that are to be summed.
//        The program then prints the formula that describes the addition of the numbers.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());


        System.out.println(first + " + " + second + " = " + (first + second));
    }
}
