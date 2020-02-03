
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int powerOfNumber = (int) Math.pow(number,2);

        System.out.println(powerOfNumber);
    }
}
