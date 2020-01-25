
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");

        String stringMessage = scan.nextLine();

        System.out.println("Give an integer:");

        int intMessage = Integer.parseInt(scan.nextLine());

        System.out.println("Give a double:");

        double doubleMessage = Double.parseDouble(scan.nextLine());

        System.out.println("Give a boolean:");

        boolean booleanMessage = Boolean.parseBoolean(scan.nextLine());

        System.out.println("You gave the string " + stringMessage);
        System.out.println("You gave the integer " + intMessage);
        System.out.println("You gave the double " + doubleMessage);
        System.out.println("You gave the boolean " + booleanMessage);

    }
}
