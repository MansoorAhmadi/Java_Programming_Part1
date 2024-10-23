package part2.part3_subPart;

public class StarSign {
    public static void main(String[] args) {


        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!

        printStars(5);
        printStars(3);
        printStars(9);

        System.out.println("\n---");  // printing --- between the shapes

        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }


    public static void printStars(int number) {
        // first part of the exercise
        int count = 0;
        while (number > count) {
            System.out.print("*");
            count++;
        }
        System.out.println("");
    }



    public static void printSquare(int size) {
        // second part of the exercise
        for (int i = 0; i < size; i++) {
            printLine(size);
        }
    }




    public static void printRectangle(int s, int height) {
        // third part of the exercise
        for (int i = 0; i < height; i++) {
            printLine(s);
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        for (int i=0; i<=size; i++) {
            printLine(i);
        }
    }

    public static void printLine(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
