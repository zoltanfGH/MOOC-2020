
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> list = new ArrayList<>();

        while (true){
            int number = scanner.nextInt();

            if (number == -1){
                break;
            }

            list.add(number);
        }

        int counter = 0;
        int sum = 0;


        for (int number: list) {
            sum += number;
            counter++;
        }

        double avg = (double) sum / counter;
        System.out.println("Average: " + avg);
    }
}
