package part4.oop.exc15;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics sumOfStatistics = new Statistics();
        Statistics sumOfEven = new Statistics();
        Statistics sumOfOdd = new Statistics();

        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers,
        // and lastly the one that tracks the sum of odd numbers!

        // PART 2
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());



        // PART 3
//        sumOfStatistics.addNumber(3);
//        sumOfStatistics.addNumber(5);
//        sumOfStatistics.addNumber(1);

        System.out.println("Enter numbers: ");

        while (true) {
            Integer input = scanner.nextInt();

            if (input >= 0) {
                if (input % 2 == 0) {
                    sumOfEven.addNumber(input);
                } else {
                    sumOfOdd.addNumber(input);
                }

                // in all cases
                sumOfStatistics.addNumber(input);
            }

            if (input == -1) {
                break;
            }
        }
        System.out.println("Sum: " + sumOfStatistics.sum());
        System.out.println("Sum of even numbers: " + sumOfEven.sum());
        System.out.println("Sum of odd numbers: " + sumOfOdd.sum());
    }
}
