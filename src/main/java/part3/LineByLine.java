package part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LineByLine
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      String[] split;

      while (true) {
         String input = scanner.nextLine();
         if (input.equals("")){
            break;
         }
         split = input.split(" ");
         for (String word : split) {
            System.out.println(word);
         }
      }

   }

}
