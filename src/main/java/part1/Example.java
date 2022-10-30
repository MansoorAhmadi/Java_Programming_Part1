package part1;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        //expression
        System.out.println("Four: " + (2 + 2));

        //concatenation
        System.out.println("But! Twenty-two: " + 2 + 2);


        //what will be the output
        int dividend = 3;
        int divisor = 2;

        //dividing two integers and storing the result in a double
        double answer = dividend / divisor;
        System.out.println(answer);

        double result = dividend / divisor * 1.0;
        System.out.println(dividend + " / " + divisor + " * " + "1.0" + " = " + result);



        int first = (1 + 1);
        int second = first + 3 * (2 + 5);
        first = 5;
        int third = first + second;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);


//        Comparison operators can also be used outside of conditionals.
//        In those cases, the boolean value resulting from the comparison is stored in a boolean variable for later use.
        int firstNumber = 1;
        int secondNumber = 3;
        boolean isGreater = firstNumber > secondNumber;
        if (isGreater) {
            System.out.println("1 is less than 3!");
        }

        //If we want to know whether the number given by the user is divisible by four hundred.
        // We check if the remainder is zero after taking the modulo of the number and four hundred.

        //Since the modulo is an operation just like other calculations, it can be a part of an expression in a conditional statement.
        // if (number % 400 == 0)

        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        int remainder = number % 400;

        if (remainder == 0) {
            System.out.println("The number " + number + " is divisible by four hundred.");
        } else {
            System.out.println("The number " + number + " is not divisible by four hundred.");
        }



    }



}
