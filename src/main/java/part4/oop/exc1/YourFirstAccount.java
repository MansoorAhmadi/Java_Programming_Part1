package part4.oop.exc1;

public class YourFirstAccount
{
   public static void main(String[] args)
   {
      Account mansoor = new Account("Mansoor's account: ", 100.0);

      System.out.println("Initial state");
      System.out.println(mansoor);

      mansoor.deposit(20.0);
      System.out.println("The balance of Mansoor's account is now: " + mansoor);

      System.out.println("End state");
      System.out.println(mansoor);
   }
}
