package part2.moreLoops;

import java.util.Scanner;

public class FromWhereToWhere {
    public static void main(String[] args) {
        //Where to [PART-1]
        //Write a program which prints the integers from 1 to a number given by the user.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int whereTo = Integer.valueOf(scanner.nextInt());
        for (int i=1; i<=whereTo; i++) {
            System.out.println(i);
        }

        //Where to [PART-2]
//        System.out.print("Where to?");
//        int whereTo = Integer.valueOf(scanner.nextInt());
//
//        System.out.print("From where?");
//        int fromWhere = Integer.valueOf(scanner.nextInt());
//
//        for (int i=fromWhere; i<=whereTo; i++) {
//            System.out.println(i);
//        }
    }
}
