package part2.moreLoops;

import java.util.Scanner;

public class CountingToHundred {
    public static void main(String[] args) {

        //Write a program, which reads an integer from the user.
        // Then the program prints numbers from that number to 100.
        // You can assume that the user always gives a number less than 100.

        Scanner scanner = new Scanner(System.in);
        int value = Integer.valueOf(scanner.nextInt());

        for (int i=value; i<=100; i++) {
            System.out.println(i);
        }
    }
}