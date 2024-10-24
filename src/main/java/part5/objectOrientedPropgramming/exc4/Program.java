package part5.objectOrientedPropgramming.exc4;

public class Program {
    public static void main(String[] args) {
//        Fitbyte assistant = new Fitbyte(30, 60);
        Fitbyte assistant = new Fitbyte(30, 60);

        double percentage = 0.5;

        while (percentage < 1.0) {
            double target = assistant.targetHeartRate(percentage);
            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
            percentage = percentage + 0.1;
        }
    }

//    public static void main(String[] args) {
//        int age = 30;
//        int restingHeartRate = 70;
//        double targetPercentage = 0.6;
//
//        // Calculate maximum heart rate
//        int maximumHeartRate = 220 - age;
//
//        // Calculate target heart rate using Karvonen method
//        double heartRateReserve = maximumHeartRate - restingHeartRate;
//        double targetHeartRateKarvonen = (heartRateReserve * targetPercentage) + restingHeartRate;
//
//        // Calculate target heart rate using zone-based method
//        double targetHeartRateZoneBased = maximumHeartRate * targetPercentage;
//
//        System.out.println("Karvonen method: " + targetHeartRateKarvonen);
//        System.out.println("Zone-based method: " + targetHeartRateZoneBased);
//    }
}
