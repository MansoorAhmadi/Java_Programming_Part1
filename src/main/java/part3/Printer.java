package part3;

public class Printer
{
   public static void main(String[] args) {
      // You can test the method here
      int[] array = {5, 1, 3, 4, 2};
      printArrayInStars(array);
   }

   public static void printArrayInStars(int[] array) {
      // Write some code in here
      int index = 0;
      while (index < array.length) {
         print(array[index]);
         System.out.println("");
         index++;
      }
   }

   public static void print(int number) {
      for (int i=1; i<=number; i++) {
         System.out.print("*");
      }
   }
}
