
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());

        int secondNumber = Integer.parseInt(scanner.nextLine());

        int total = firstNumber + secondNumber;

        double squareOfTotal = Math.sqrt(total);

        System.out.println(squareOfTotal);

    }
}
