package part1;

import java.util.Scanner;

public class Adulthood {
    public static void main(String[] args) {

        //Write a program that prompts the user for their age and tells them whether or not they are an adult (18 years old or older).
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");

        int age = Integer.valueOf(scan.nextInt());
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
    }
}
