package part4.oop.exc8;

public class MainProgram {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        // initial value
        counter.printValue();
        counter.decrement();
        counter.decrement();

        // decremented
        counter.printValue();
    }
}
