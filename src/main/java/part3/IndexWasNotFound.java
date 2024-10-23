package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexWasNotFound
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      int[] array = new int[10];
      array[0] = 6;
      array[1] = 2;
      array[2] = 8;
      array[3] = 1;
      array[4] = 3;
      array[5] = 0;
      array[6] = 9;
      array[7] = 7;

      System.out.print("Search for? ");
      int searching = Integer.valueOf(scanner.nextInt());
      // Implement the search functionality here

      int tmp = 0;
      for (int index = 0; index < array.length; index++) {
         if (array[index] == searching) {
            tmp = index;
            break;
         }
      }
      System.out.println("");

      if (array[tmp] == searching) {
         System.out.println(searching + " is at index " + tmp);
      } else {
         System.out.println(searching + " was not found.");
      }
   }
}
