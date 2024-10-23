package part4.filesAndReadingData.exc11;

import part4.filesAndReadingData.exc10.Person;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
//        String fileName = scan.nextLine();
        String fileName = "/Users/mansoorahmadi/IdeaProjects/JavaProgrammingPart1/src/main/java/part4/filesAndReadingData/exc11/data.csv";

        System.out.println("Team: ");
        String team = scan.nextLine();

        ArrayList<String> list = statistics(fileName, team);
        System.out.println("Games: " + list.size());
        System.out.println("Wins: " + list.size()/2);
        if (list.size() == 1) {
            System.out.println("Wins: " + list.size());
        }
        System.out.println("Losses: " + list.size()/2);
    }

    public static ArrayList<String> statistics(String fileName, String team) {
        ArrayList<String> list = new ArrayList<>();

//        file = "/Users/mansoorahmadi/IdeaProjects/JavaProgrammingPart1/src/main/java/part4/filesAndReadingData/exc10/data.txt";
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNext()) {
                String[] input = scanner.nextLine().split(",");
                String name = String.valueOf(input[0]);
                String gamesPlayed = String.valueOf(input[1]);
                if (team.equalsIgnoreCase(name)) {
                    list.add(name);
                } else if (team.equalsIgnoreCase(gamesPlayed)) {
                    list.add(gamesPlayed);
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }
        return list;
    }
}
