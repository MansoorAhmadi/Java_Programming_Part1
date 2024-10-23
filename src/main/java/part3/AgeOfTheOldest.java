package part3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class AgeOfTheOldest
{
   public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);
      int sum = 0;
      ArrayList<Integer> list = new ArrayList<>();

      while (true) {
         String input = reader.nextLine();
         if (input.equals("")) {
            break;
         }

         String[] parts = input.split(",");
         list.add(sum + Integer.valueOf(parts[1]));
      }
         System.out.println("Age of the oldest: : " + Collections.max(list));
   }
}
