package part3;

import java.util.*;

public class PersonalDetails
{
   public static void main(String[] args)
   {
      Scanner reader = new Scanner(System.in);
      ArrayList<String> list = new ArrayList<>();

      String longestName = "";

      float average = 0;
      int count = 0;
      while (true)
      {
         String input = reader.nextLine();
         if (input.equals(""))
         {
            break;
         }

         String[] parts = input.split(",");
         list.add(parts[0]);
         average += Integer.valueOf(parts[1]);
         count++;

         int length = 0;
         for (String name : list)
         {
            if (length < name.length())
            {
               length = name.length();
               longestName = name;
            }
         }
      }

      System.out.println("Longest name: " + longestName);
      System.out.println("Average of the birth years: " + average / count);


//      String longestName = "";
//      int length = list.get(0).length();
//      for (String name : list)
//      {
//         if (length <= name.length())
//         {
//            length = name.length();
//            longestName = name;
//         }
//      }

//      System.out.println("Longest name: " + longestName);
//      System.out.println("Average of the birth years: " + average / count);
   }
}
