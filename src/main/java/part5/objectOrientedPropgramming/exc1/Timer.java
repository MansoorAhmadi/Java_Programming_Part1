package part5.objectOrientedPropgramming.exc1;

public class Timer {
    private ClockHand seconds;
    private ClockHand milliseconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.milliseconds = new ClockHand(100);
    }

    public void advance() {
        this.milliseconds.advance();
        if (this.milliseconds.value() == 0) {
            this.seconds.advance();
        }
    }

    @Override
    public String toString() {
        return this.seconds + ":" + this.milliseconds;
    }
}
