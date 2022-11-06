package part2;

import java.util.Scanner;

public class Practice {

//    public static void main(String[] args) {
//
//        int number = 1;
//
//        while (true) {
//            System.out.println(number);
//            if (number == 5) {
//                break;
//            }
//            number++;
//        }
//        System.out.println("Ready!");
//    }

//    public static void main(String[] args) {
//
//        //In the example below, the program asks the user whether to exit the loop or not.
//        // If the user inputs the string "y", the execution of the program moves to the command following the loop block,
//        // after which the execution of the program ends
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Exit? (y exits)");
//            String input = scanner.nextLine();
//            if (input.equals("y")) {
//                break;
//            }
//
//            System.out.println("Ok! Let's carry on!");
//        }
//
//        System.out.println("Ready!");
//    }


    //BREAK command - The program in the example above is repeated infinitely since the break command used for exiting the loop is not used.
    // To exit the loop, the break command must be added to it.
//    public static void main(String[] args) {
//
//        //In the previous example, the program read inputs of type string from the user.
//        // The program can also be implemented with other types of variables.
//        // The program below asks numbers from the user until the user inputs a zero.
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Input a number, 0 to quit");
//            int command = Integer.valueOf(scanner.nextLine());
//            if (command == 0) {
//                break;
//            }
//
//            System.out.println("You input " + command);
//        }
//
//        System.out.println("Done, thank you!");
//    }


    //CONTINUE - The purpose of continue. Continue will bring the execution to the beginning of the method or function.
//    public static void main(String[] args) {
        //The example below demonstrates the use of the continue command.
        // The program asks the user to input positive numbers.
        // If the user inputs a negative number or a zero, the program prints the message "Unfit number, try again",
        // after which the execution returns to the beginning of the loop.
        // In the previous example, the program read inputs of type string from the user.
        // Similar programs with different input types are also possible.
        // In the example below, the user is asked for numbers until they input a zero.

//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Insert positive integers");
//            int number = Integer.valueOf(scanner.nextLine());
//
//            if (number <= 0) {
//                System.out.println("Unfit number! Try again.");
//                continue;
//            }
//
//            System.out.println("Your input was " + number);
//        }
//    }



    //BREAK and CONTINUE
//    public static void main(String[] args) {
        //The program in the example above is repeated infinitely since the break command used for exiting the loop is not used.
        // To exit the loop, the break command must be added to it.
        //
        //In the example below, the program is modified in such a way that the user is asked to input positive numbers.
        // If the user inputs a negative number, the program informs them that the number was unfit and returns to the beginning of the loop.
        // If the number was zero, the program exits the loop.

//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Input positive numbers.");
//            int number = Integer.valueOf(scanner.nextLine());
//
//            if (number == 0) {
//                break;
//            }
//
//            if (number < 0) {
//                System.out.println("Unfit number! Try again.");
//                continue;
//            }
//
//            System.out.println("Your input was " + number);
//        }
//    }


    //WHAT DOES THE PROGRAM BELOW PRINT?
//    public static void main(String[] args) {

//        int number = 0;
//
//        while (true) {
//            number = number + 1;
//
//            if (number >= 5) {
//                break;
//            }
//
//            if (number < 5) {
//                continue;
                //it does not print 1 2 3 4
                //continue will take you to the top of the function.
//            }
//            System.out.print(number + " ");
//        }
//        System.out.print(number + " ");
        //the output is 5
//    }


    //CALCULATION with LOOPS
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // The task is to read an input from the user
        while (true) {

            // The task is to keep count of number ones
            int ones = 0;

            System.out.println("Insert a number (0 exits): ");
            // The task is to read a user inputted number
            int number = Integer.valueOf(scanner.nextLine());

            // The task is to exit the loop if the user
            // has inputted zero
            if (number == 0) {
                break;
            }

            // The task is to increase the amount of ones
            // if the user inputs a number one
            if (number == 1) {
                ones = ones + 1;
            }

            // The task is to print out the total of ones
            // This doesn't work because the variable ones has been
            // introduced within the loop
            System.out.println("The total of ones: " + ones);
        }
    }

}
