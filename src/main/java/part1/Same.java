package part1;

import java.util.Scanner;

public class Same {
    public static void main(String[] args) {

        //Write a program that prompts the user for two strings. If the strings are the same, then the program prints "Same".
        // Otherwise, it prints "Different".

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String first = scan.nextLine();

        System.out.println("Enter the second string:");
        String second = scan.nextLine();

        if (first.equals(second)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
