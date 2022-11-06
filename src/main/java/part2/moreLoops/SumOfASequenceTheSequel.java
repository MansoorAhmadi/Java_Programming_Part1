package part2.moreLoops;

import java.util.Scanner;

public class SumOfASequenceTheSequel {
    public static void main(String[] args) {

        // Implement a program which calculates the sum of a closed interval, and prints it.
        // Expect the user to write the smaller number first and then the larger number.
        //
        //You can base your solution to this exercise to the solution of last exercise —
        // add the functionality for the user to enter the starting point as well.

        Scanner scanner = new Scanner(System.in);

        System.out.print("First number?");
        int firstNumber = Integer.valueOf(scanner.nextInt());

        System.out.print("Last number?");
        int lastNumber = Integer.valueOf(scanner.nextInt());
        int sum = 0;

        for (int i=firstNumber; i<=lastNumber; i++) {
            sum = sum + i;
        }

        System.out.println("The sum is " + sum);

    }
}
