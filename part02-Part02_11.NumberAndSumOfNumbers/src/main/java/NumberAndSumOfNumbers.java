
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberSum = 0;
        int numberOfTimesNumber = 0;

        while (true){

            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0){
                System.out.println("Number of numbers: " + numberOfTimesNumber);
                System.out.println("Sum of the numbers: " + numberSum);
                break;
            }

            numberSum += number;
            numberOfTimesNumber++;
        }
    }
}
