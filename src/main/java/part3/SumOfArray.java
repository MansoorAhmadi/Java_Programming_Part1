package part3;

import java.util.Scanner;

public class SumOfArray
{
   public static void main(String[] args) {
      // You can try the method here
      int[] array = {5, 1, 3, 4, 2};
      System.out.println(sumOfNumbersInArray(array));
   }

   public static int sumOfNumbersInArray(int[] array) {
      // Write some code here
      int index = 0;
      for (int number : array)
      {
         index += number;
      }
      return index;
   }

//   public static void main(String[] args)
//   {
//      Scanner scanner = new Scanner(System.in);
//
//      System.out.println("How many numbers? ");
//      int numbers = Integer.valueOf(scanner.nextLine());
//
//      System.out.println("Enter the numbers: ");
//      int[] inputs = new int[numbers];
//
//      int index = 0;
//      while (index < inputs.length) {
//         inputs[index] = Integer.valueOf(scanner.nextLine());
//
//         index++;
//      }
//
//      System.out.println("Here are the numbers again:");
//      for (int input : inputs)
//      {
//         System.out.println(input);
//      }
//   }
}
