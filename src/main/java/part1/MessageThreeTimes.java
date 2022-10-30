package part1;

import java.util.Scanner;

public class MessageThreeTimes {
    public static void main(String[] args) {
        //print the user input 3 times

        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();

        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
    }
}
