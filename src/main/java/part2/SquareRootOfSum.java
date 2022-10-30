package part2;

import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args) {

        //Write a program that reads two integers from the user and prints the square root of the sum of these integers.
        // The program does not need to work with negative values.
        //
        //You can calculate the square root of an integer with the command Math.sqrt like this:

        Scanner scanner = new Scanner(System.in);

        int value1 = Integer.valueOf(scanner.nextLine());
        int value2 = Integer.valueOf(scanner.nextLine());

        int result = (int) Math.sqrt(value1 + value2);
        System.out.println(result);
    }
}
