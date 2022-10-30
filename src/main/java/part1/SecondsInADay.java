package part1;

import java.util.Scanner;

public class SecondsInADay {
    public static void main(String[] args) {

        //In the exercise template, implement a program that asks the user for the number of days. After that,
        // the program prints the number of seconds in the given number of days.

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());

        System.out.println(days*86400);
        //How many days would you like to convert to seconds?
        //7
        //604800

        //Day
        //
        //Definition: A day (symbol: d) is an accepted,
        // non-SI unit of time that is defined based on the SI (International System of Units) unit of time, the second,
        // and is equal to 86,400 seconds.

        //Second
        //The second was historically defined as 1/86400 of a day in 1832,
        // which was based on the definition of a day as the approximate amount of time required
        // for the Earth to complete a full rotation cycle relative to the sun.
    }
}
