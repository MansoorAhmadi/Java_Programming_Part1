package part1;

import java.util.Scanner;

public class BooleanInput {
    public static void main(String[] args) {
        //Write a program that asks the user for a boolean value. The program should then print the value provided by the user.
        //
        //Example prints for the program can be seen below.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something:");
        boolean value = Boolean.valueOf(scanner.nextLine());
        System.out.println("True or false? " + value);

        //Write something:
        //TRUE
        //True or false? true

    }
}
