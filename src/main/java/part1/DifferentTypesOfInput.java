package part1;

import javax.swing.*;
import java.util.Scanner;

public class DifferentTypesOfInput {
    public static void main(String[] args) {

        //Write a program that asks the user for a string, an integer, a floating-point number, and a boolean.
        // The program should then print the values given by the user.
        //
        //Example prints for the program can be seen below.

        Scanner scan = new Scanner(System.in);

        // Write your program here

        System.out.println("Give a string:");
        String string = scan.nextLine();


        System.out.println("Give an integer:");
        int integer = Integer.valueOf(scan.nextLine());


        System.out.println("Give a double:");
        double doubl = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scan.nextLine());


        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + doubl);
        System.out.println("You gave the boolean " + bool);

//        Give a string:
//        Oops!
//                Give an integer:
//        -4
//        Give a double:
//        3200.1
//        Give a boolean:
//        false
//        You gave the string Oops!
//                You gave the integer -4
//        You gave the double 3200.1
//        You gave the boolean false

    }
}
