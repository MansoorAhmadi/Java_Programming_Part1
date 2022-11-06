package part2;

import java.util.Scanner;

public class AreWeThereYet {
    public static void main(String[] args) {

        //Write a program, according to the preceding example, that asks the user to input values until they input the value 4.

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextInt());
            if (value == 4) {
                break;
            }
        }

    }
}
