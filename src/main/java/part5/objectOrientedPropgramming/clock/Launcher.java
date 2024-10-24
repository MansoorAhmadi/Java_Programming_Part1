package part5.objectOrientedPropgramming.clock;

public class Launcher {
    public static void main(String[] args) {
        Clock hours = new Clock(24);
        Clock minutes = new Clock(60);
        Clock seconds = new Clock(60);

        while (true) {
            // 1. Printing the time
            System.out.println(hours + ":" + minutes + ":" + seconds);

            // 2. Advancing the second hand
            seconds.increment();

            // 3. Advancing the other hands when required
            if (seconds.getValue() == 0) {
                minutes.increment();

                if (minutes.getValue() == 0) {
                    hours.increment();
                }
            }
        }
    }
}
