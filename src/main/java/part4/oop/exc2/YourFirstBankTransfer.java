package part4.oop.exc2;

public class YourFirstBankTransfer
{
   public static void main(String[] args)
   {
      Account mathew = new Account("Matthews account", 1000.0);
      Account myAccount = new Account("My account", 0.0);

      System.out.println("Initial state");
      System.out.println(mathew);
      System.out.println(myAccount);
      System.out.println();

      mathew.withdrawal(100.0);
      System.out.println(mathew);

      myAccount.deposit(100.0);
      System.out.println(myAccount);
      System.out.println();

      System.out.println("End state");
      System.out.println(mathew);
      System.out.println(myAccount);
   }
}
