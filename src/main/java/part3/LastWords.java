package part3;

import java.util.Scanner;

public class LastWords
{
   public static void main(String[] args)
   {
      Scanner reader = new Scanner(System.in);
      while (true) {
         String input = reader.nextLine();
         if (input.equals("")) {
            break;
         }

         String[] pieces = input.split(" ");
         int index = pieces.length -1;
         System.out.println(pieces[index]);
      }
   }

}
