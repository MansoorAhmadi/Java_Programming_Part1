package part2.moreLoops;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {

        //Write a program that reads an integer from the user.
        // Next, the program prints numbers from 0 to the number given by the user.
        // You can assume that the user always gives a positive number. Below are some examples of the expected functionality.

        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextInt());
        for (int i=0; i<=input; i++) {
            System.out.println(i);
        }
    }
}
