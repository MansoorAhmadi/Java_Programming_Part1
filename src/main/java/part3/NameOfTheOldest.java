package part3;

import java.util.*;

public class NameOfTheOldest
{
   public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);
      ArrayList<Integer> list = new ArrayList<>();
      Map<Integer, String> map = new HashMap<>();

      while (true) {
         String input = reader.nextLine();
         if (input.equals("")) {
            break;
         }

         String[] parts = input.split(",");
         list.add(Integer.valueOf(parts[1]));
         map.put(Integer.valueOf(parts[1]), parts[0]);
      }
      System.out.println("Name of the oldest: " + map.get(Collections.max(list)));
   }
}
