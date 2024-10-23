package part4.filesAndReadingData.exc8;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> list = new ArrayList<>();
        try (Scanner guestList = new Scanner(Paths.get(file))) {
//        try (Scanner guestList = new Scanner(Paths.get("/Users/mansoorahmadi/IdeaProjects/JavaProgrammingPart1/src/main/java/part4/filesAndReadingData/exc8/numbers-1.txt"))) {
            while (guestList.hasNext()) {
                list.add(Integer.valueOf(guestList.nextLine()));
            }

            int count = 0;
            for (Integer number : list) {
                if (lowerBound <= number && upperBound >= number) {
                    count ++;
                }
            }
            System.out.println("Numbers: " + count);
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
