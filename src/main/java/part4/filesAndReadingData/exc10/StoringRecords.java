package part4.filesAndReadingData.exc10;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
//        Scanner scan = new Scanner(Paths.get("/Users/mansoorahmadi/IdeaProjects/JavaProgrammingPart1/src/main/java/part4/filesAndReadingData/exc10/data.txt"));

        System.out.println("Filename:");
//        String file = scan.nextLine();
        String file = "";

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

//        file = "/Users/mansoorahmadi/IdeaProjects/JavaProgrammingPart1/src/main/java/part4/filesAndReadingData/exc10/data.txt";
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNext()) {
                String[] input = scanner.nextLine().split(",");
                String name = String.valueOf(input[0]);
                int age = Integer.valueOf(input[1]);
                Person person = new Person(name, age);
                persons.add(person);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        return persons;
    }
}
