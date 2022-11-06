package part2.moreLoops;

import java.util.Scanner;

public class SumOfASequence {
    public static void main(String[] args) {
        //Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number?");

        int input = Integer.valueOf(scanner.nextInt());
        int sum = 0;

        for (int i=1; i<=input; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
    }
}
