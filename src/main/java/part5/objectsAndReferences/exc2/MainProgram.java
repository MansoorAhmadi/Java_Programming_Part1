package part5.objectsAndReferences.exc2;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pet hulda = new Pet("Hulda", "Golden retriever");
        Person leo = new Person("Leo", hulda);

        System.out.println(leo.toString());

        // e
        //
        // xample main program for the first section of the exercise

//        HealthStation childrensHospital = new HealthStation();

//        Person ethan = new Person("Ethan", 1, 110, 7);
//        Person peter = new Person("Peter", 33, 176, 85);

//        Person ethan = new Person("Ethan", 7);
//        Person peter = new Person("Peter", 85);
//
//        System.out.println(ethan.getName() + "'s weight: " + childrensHospital.weigh(ethan) + " kilos");
//        System.out.println(peter.getName() + "'s weight: " + childrensHospital.weigh(peter) + " kilos");





    }
}
