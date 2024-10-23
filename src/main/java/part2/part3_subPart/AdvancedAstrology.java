package part2.part3_subPart;

public class AdvancedAstrology {
    public static void printStars(int number) {
        // first part of the exercise
        for (int i=0; i<number; i++) {
            printSpaces(number);
            printLine(i);
        }
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i=0; i<number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i=0; i<size; i++) {
//            printSpaces(size);
            printStars(i);
//            System.out.println("");
        }

    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
//        christmasTree(4);
//        System.out.println("---");
//        christmasTree(10);
    }

    public static void printLine(int number) {
        for (int i = 0; i < number; i++) {
//            printSpaces(number);
            System.out.print("*");
        }
        System.out.println();
    }
}
