
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        int fromNumber = Integer.valueOf(scanner.nextLine());
        int toNumber = Integer.valueOf(scanner.nextLine());

        for (int i = fromNumber; i <= toNumber ; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
