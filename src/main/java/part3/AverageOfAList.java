package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      ArrayList<Integer> list = new ArrayList<>();
      while (true)
      {
         int input = Integer.valueOf(scanner.nextLine());
         if (input == -1)
         {
            break;
         }

         list.add(input);
      }

      System.out.println("");
      float average = 0;
      for (Integer number : list)
      {
         average += number;
      }

      System.out.println("Average: " + average / list.size());
   }
}
