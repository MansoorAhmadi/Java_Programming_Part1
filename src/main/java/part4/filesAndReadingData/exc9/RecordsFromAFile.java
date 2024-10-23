package part4.filesAndReadingData.exc9;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name of the file: ");
        String file = scanner.nextLine();

//        try (Scanner guestList = new Scanner(Paths.get(file))) {
        try (Scanner guestList = new Scanner(Paths.get("/Users/mansoorahmadi/IdeaProjects/JavaProgrammingPart1/src/main/java/part4/filesAndReadingData/exc9/data.txt"))) {
            while (guestList.hasNext()) {
                String[] input = guestList.nextLine().split(",");
                String name = input[0];
                int age = Integer.valueOf(input[1]);
                String year = "year";
                String years = "years";

                if (age == 1) {
                    System.out.println(name + ", " + "age: " + age + " " + year);
                } else {
                    System.out.println(name + ", " + "age: " + age + " " + years);
                }
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
