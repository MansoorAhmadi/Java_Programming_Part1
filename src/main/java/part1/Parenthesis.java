package part1;

public class Parenthesis {
    public static void main(String[] args) {

        //You can affect the order of operations by using parentheses.
        // Operations within parentheses are performed before those outside them.

        int calculationWithParentheses = (1 + 1) + 3 * (2 + 5);
        System.out.println(calculationWithParentheses); // prints 23

        int calculationWithoutParentheses = 1 + 1 + 3 * 2 + 5;
        System.out.println(calculationWithoutParentheses); // prints 13
    }
}
