package part1;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class GiftTax {

    private static final DecimalFormat df = new DecimalFormat("0.00000000000");
    public static void main(String[] args) {

        //https://www.vero.fi/en/individuals/property/gifts/: A gift is a transfer of property to another person against no compensation or payment.
        // If the total value of the gifts you receive from the same donor in the course of 3 years is €5,000 or more, you must pay gift tax.
        //
        //When a gift is given by a close relative or a family member, the amount of gift tax is determined by the following table (source vero.fi):

        //For example 6000€ gift implies 180€ of gift tax (100 + (6000-5000) * 0.08),
        // and 75000€ gift implies 7100€ of gift tax (4700 + (75000-55000) * 0.12).
        //
        //Write a program that calculates the gift tax for a gift from a close relative or a family member. This is how the program should work:

        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());

        double taxCalculate;
        if (((giftValue >= 5000) && (giftValue < 25000))) {
            taxCalculate = (100 + (giftValue - 5000) * 0.08);
            System.out.println(taxCalculate);
        } else if (((giftValue >= 25000) && (giftValue < 55000))) {
            taxCalculate = (1700 + (giftValue - 25000) * 0.10);
            System.out.println(taxCalculate);
        } else if (((giftValue >= 55000) && (giftValue < 200000))) {
            taxCalculate = (4700 + (giftValue - 55000) * 0.12);
            System.out.println(taxCalculate);
        } else if (((giftValue >= 200000) && (giftValue < 1000000))) {
            taxCalculate = (22100 + (giftValue - 200000) * 0.15);
            System.out.println(taxCalculate);
        } else if (giftValue >= 1000000 ) {
            taxCalculate = (142100 + (giftValue - 1000000) * 0.17);
            System.out.println(taxCalculate);
        } else {
            System.out.println("No Tax!");
        }

        //Solve The ERROR
        //With input 974634 output was "Value of the gift? is =  138295.1 ".
        //Expected tax to be 138295.09999999998



        //tax table
//        Value of gift	        Tax at the lower limit	        Tax rate(%) for exceeding part
//        5 000 — 25 000	            100	                                    8
//        25 000 — 55 000	            1 700	                                10
//        55 000 — 200 000	            4 700	                                12
//        200 000 — 1 000 000	        22 100	                                15
//        1 000 000 —	                142 100	                                17
    }
}
