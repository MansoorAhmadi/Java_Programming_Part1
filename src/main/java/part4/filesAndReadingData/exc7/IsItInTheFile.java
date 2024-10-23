package part4.filesAndReadingData.exc7;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        try (Scanner guestList = new Scanner(Paths.get(file))) {
            //WORKS WITH THE ABSOLUTE PATH
//        try (Scanner guestList = new Scanner(Paths.get("/Users/mansoorahmadi/IdeaProjects/JavaProgrammingPart1/src/main/java/part4/filesAndReadingData/exc7/names.txt"))) {
            while (guestList.hasNext()) {
                list.add(guestList.nextLine());
            }

            if (list.contains(searchedFor)) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
