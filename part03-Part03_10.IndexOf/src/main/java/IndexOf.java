
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.print("Search for? ");
        int findNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == findNumber){
                System.out.println(findNumber + " is at index " + i);
            }
        }

    }
}
