package part3;

import java.util.Scanner;

public class Login
{
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter username: ");
      String username = scanner.nextLine();

      System.out.println("Enter password:");
      String password = scanner.nextLine();

      if ((("alex".equals(username)) && ("sunshine".equals(password)) || (("emma".equals(username)) && ("haskell".equals(password))))) {
         System.out.println("You have successfully logged in!");
      } else {
         System.out.println("Incorrect username or password!");
      }

   }
}