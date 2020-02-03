
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTimesNumber = 0;

        while (true){

            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0){
                System.out.println("Number of numbers: " + numberOfTimesNumber);
                break;
            }

            numberOfTimesNumber++;
        }
    }
}
