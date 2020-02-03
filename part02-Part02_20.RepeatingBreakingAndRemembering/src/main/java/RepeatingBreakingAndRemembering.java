
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int numberOfTimesNumber = 0;
        int even = 0;
        int odd = 0;

        while (true){
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1){
                System.out.println("Thx! Bye!");
                break;
            }

            if (number % 2 == 0){
                even++;
            } else {
                odd++;
            }

            sum += number;
            numberOfTimesNumber++;
        }
        System.out.println("Sum:" + sum);
        System.out.println("Numbers: " + numberOfTimesNumber);

        double averageOfNumber = (double) sum / numberOfTimesNumber;

        System.out.println("Average: " + averageOfNumber);

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
