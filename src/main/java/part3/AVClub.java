package part3;

import java.util.Scanner;

public class AVClub
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
            if (word.contains("av")) {
               System.out.println(word);
            }
         }
      }

   }
}
