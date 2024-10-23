package part4.filesAndReadingData.exc5;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAsSpecifiedFile {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Which file should have its contents printed? ");
        String input = String.valueOf(userInput.nextLine());
        try (Scanner scanner = new Scanner(Paths.get(input))) {
            while (scanner.hasNext()) {
                String data = scanner.nextLine();
                // works, with the absolute path of the song.txt
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
