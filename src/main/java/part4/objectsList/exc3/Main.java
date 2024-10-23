package part4.objectsList.exc3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        TelevisionProgram program;
        while (true) {

            System.out.print("Name: ");
            String name = String.valueOf(scanner.nextLine());
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());

            program = new TelevisionProgram(name, duration);
            programs.add(program);
        }

        System.out.println("");
        System.out.print("Program's maximum duration? ");
        int maxDuration = scanner.nextInt();

        for (TelevisionProgram tv : programs) {
            if (tv.getDuration() <= maxDuration) {
                System.out.println(tv);
            }
        }
    }
}
