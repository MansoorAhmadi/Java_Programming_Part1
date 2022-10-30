package part2;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {

        //Write a program that reads an integer from the user.
        // If the number is less than 0, the program prints the given integer multiplied by -1.
        // In all other cases, the program prints the number itself.
        // A few examples of how the program's expected to function are shown below:

        Scanner scanner = new Scanner(System.in);
        int firstValue = Integer.valueOf(scanner.nextInt());

        if (firstValue < 0) {
            System.out.println(firstValue * -1);
        } else {
            System.out.println(firstValue);
        }
    }
}
