package part2.part3_subPart;

public class Summation {
    public static double sum(int number1, int number2, int number3, int number4) {
        int sum = number1 + number2 + number3 + number4;
        return sum;
    }

    public static void main(String[] args) {
        int answer = (int) sum(4, 3, 6, 1);
        System.out.println("Sum: " + answer);
    }
}
