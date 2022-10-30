package part1;

import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double value = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + value);

//        Give a number:
//        2.718
//        You gave the number 2.718
    }
}
