
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number<0){
            int absolute = number * (-1);
            System.out.println(absolute);
        } else {
            System.out.println(number);
        }
    }
}
