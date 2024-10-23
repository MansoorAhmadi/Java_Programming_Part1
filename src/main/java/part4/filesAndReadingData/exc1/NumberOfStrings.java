package part4.filesAndReadingData.exc1;

import java.util.Scanner;

public class NumberOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer count = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
//            count = Integer.parseInt(input);
            count += 1;
        }
        System.out.println(count);
    }
}
