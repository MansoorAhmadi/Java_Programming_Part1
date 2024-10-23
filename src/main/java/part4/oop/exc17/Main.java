package part4.oop.exc17;

public class Main {
    public static void main(String[] args) {
        //PART -1
//        PaymentCard card = new PaymentCard(50);
//        System.out.println(card);


        // PART - 2
//        PaymentCard card = new PaymentCard(50);
//        System.out.println(card);
//        card.eatAffordably();
//        System.out.println(card);
//
//        card.eatHeartily();
//        card.eatAffordably();
//        System.out.println(card);


        PaymentCard paul = new PaymentCard(20);
        PaymentCard matt = new PaymentCard(30);

        paul.eatHeartily();
        System.out.println("Paul: " + paul);

        matt.eatAffordably();
        System.out.println("Matt: " + matt);

        paul.addMoney(20);
        System.out.println("Paul: " + paul);

        matt.eatHeartily();
        System.out.println("Matt: " + matt);

        paul.eatAffordably();
        paul.eatAffordably();
        System.out.println("Paul: " + paul);

        matt.addMoney(50);
        System.out.println("Matt: " + matt);
    }
}
