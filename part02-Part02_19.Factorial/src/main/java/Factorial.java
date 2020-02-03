
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");

        int number = Integer.valueOf(scanner.nextLine());
        int factorialSum = 1;

        for (int i = 1; i <= number; i++) {
            factorialSum *= i;
        }

        System.out.println("Factorial: " + factorialSum);

    }
}
