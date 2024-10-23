package part4.filesAndReadingData.exc4;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("/Users/mansoorahmadi/IdeaProjects/JavaProgrammingPart1/src/main/java/part4/filesAndReadingData/exc4/data.txt"))) {
            while (scanner.hasNext()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
