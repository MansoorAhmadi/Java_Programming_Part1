package part1;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        //Write a program that prompts the user for a number and informs us whether it is even or odd.
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.next());

        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even");
        } else {
            System.out.println("Number " + number + " is odd");
        }
    }
}
