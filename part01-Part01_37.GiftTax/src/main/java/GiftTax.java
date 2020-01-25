
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");

        int giftValue = scan.nextInt();
        int taxAtTheLowerLimit;
        double taxRateForExceedingPart;
        double tax;

        if (giftValue >= 5000 && giftValue < 25000){
            taxAtTheLowerLimit = 100;
            taxRateForExceedingPart = 0.08;
            tax = (taxAtTheLowerLimit + (giftValue - 5000) * taxRateForExceedingPart);
            System.out.println("Tax: " + tax);
        } else if (giftValue >= 25000 && giftValue < 55000){
            taxAtTheLowerLimit = 1700;
            taxRateForExceedingPart = 0.1;
            tax = (taxAtTheLowerLimit + (giftValue - 25000) * taxRateForExceedingPart);
            System.out.println("Tax: " + tax);
        } else if (giftValue >= 55000 && giftValue < 200000){
            taxAtTheLowerLimit = 4700;
            taxRateForExceedingPart = 0.12;
            tax = (taxAtTheLowerLimit + (giftValue - 55000) * taxRateForExceedingPart);
            System.out.println("Tax: " + tax);
        } else if (giftValue >= 200000 && giftValue < 1000000){
            taxAtTheLowerLimit = 22100;
            taxRateForExceedingPart = 0.15;
            tax = (taxAtTheLowerLimit + (giftValue - 200000) * taxRateForExceedingPart);
            System.out.println("Tax: " + tax);
        } else if (giftValue >= 1000000){
            taxAtTheLowerLimit = 142100;
            taxRateForExceedingPart = 0.17;
            tax = (taxAtTheLowerLimit + (giftValue - 1000000) * taxRateForExceedingPart);
            System.out.println("Tax: " + tax);
        } else {
            System.out.println("No tax!");
        }
    }
}
