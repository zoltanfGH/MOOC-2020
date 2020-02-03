
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberSum = 0;
        int numberOfTimesNumber = 0;

        while (true){

            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0){
                double average = (double) numberSum / numberOfTimesNumber;
                System.out.println("Average of the numbers: " + average);
                break;
            }

            numberSum += number;
            numberOfTimesNumber++;
        }

    }
}
