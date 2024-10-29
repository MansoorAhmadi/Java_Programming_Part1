package part5.repetitiveCode.exc2;

public class MainProgram {

    public static void main(String[] args) {
        Counter c1 = new Counter(5);
        c1.increase(-2);
        System.out.println(c1.value());

        System.out.println();

        Counter c2 = new Counter(900);
        c2.decrease(-55);
        System.out.println(c2.value());
    }
}
