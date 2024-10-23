package part3;

import java.util.Scanner;

public class Swap
{
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int[] array = new int[5];
      array[0] = 1;
      array[1] = 3;
      array[2] = 5;
      array[3] = 7;
      array[4] = 9;

      int index = 0;
      while (index < array.length) {
         System.out.println(array[index]);
         index++;
      }

      // Implement here
      System.out.println("");
      System.out.println("Give two indices to swap: ");
      // asking for the two indices
      int firstIndice = Integer.valueOf(scanner.nextLine());
      int secondIndice = Integer.valueOf(scanner.nextLine());

      // and then swapping them
      int tmp = array[firstIndice];
      array[firstIndice] = array[secondIndice];
      array[secondIndice] = tmp;

      System.out.println("");
      index = 0;
      while (index < array.length) {
         System.out.println(array[index]);
         index++;
      }
   }

}
