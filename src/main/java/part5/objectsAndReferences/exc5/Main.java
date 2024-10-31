package part5.objectsAndReferences.exc5;

import java.time.Instant;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // PART - 1
//        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
//        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
//        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);
//
//        System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));       // false
//        System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));  // true


        // PART - 2
//        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
//        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
//        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);
//
//        System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  //71600
//        System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));   //35400



        // PART - 3
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  // false
        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   // true(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));   //35400




        // GSS SD-869
//        IngesterInstance instance = new IngesterInstance();
//
//        // Test case 1: updatedDate is null
//        instance.setUpdatedDate(null);
//        Instant result1 = instance.getUpdatedDate();
//        System.out.println("Result 1: " + result1); // Should print false
//
//        // Test case 2: updatedDate is not null
//        Instant now = Instant.now();
//        instance.setUpdatedDate(now);
//        Instant result2 = instance.getUpdatedDate();
//        System.out.println("Result 2: " + result2); // Should print true


    }
}
