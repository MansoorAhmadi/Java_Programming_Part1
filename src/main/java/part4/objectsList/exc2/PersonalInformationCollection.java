package part4.objectsList.exc2;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        PersonalInformation information;
        while (true) {
            System.out.println("First name: ");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                break;
            }

            System.out.println("Last name: ");
            String lastName = scanner.nextLine();
            if (lastName.isEmpty()) {
                break;
            }

            System.out.println("Identification number: ");
            String idNumber = scanner.nextLine();
            if (idNumber.isEmpty()) {
                break;
            }

            information = new PersonalInformation(firstName, lastName, idNumber);
            infoCollection.add(information);
        }

        for (PersonalInformation pi : infoCollection) {
            System.out.println(pi.getFirstName() + " " + pi.getLastName());
        }

    }
}


