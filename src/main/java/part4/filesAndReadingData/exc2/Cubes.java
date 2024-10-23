package part4.filesAndReadingData.exc2;

import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            int count = Integer.parseInt(input);
            int pow = (int) Math.pow(count, 3);
            System.out.println(pow);
        }
    }
}
