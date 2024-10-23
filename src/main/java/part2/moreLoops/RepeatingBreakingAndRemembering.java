package part2.moreLoops;

import java.nio.file.LinkPermission;
import java.util.ArrayList;
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
        //

        Scanner scanner = new Scanner(System.in);
        int luku = 0;
        int count = 0;
        double average = 0;
        int even = 0;
        int odd = 0;
        String msg = "";

        System.out.println("Give numbers:");

        ArrayList<Integer> numbers = new ArrayList<>();
        int result = 0;
        while (true) {
            luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                msg = "Thx! Bye!";
                break;
            }

            if (luku % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            result += luku;
            numbers.add(result);
            count++;
            average = (double) result / count;
        }
        System.out.println(msg);
        System.out.println("Sum: " + result);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);


    }
}
