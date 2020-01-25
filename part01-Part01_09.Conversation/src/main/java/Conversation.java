
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Greetings! How are you doing?");

        String message1 = scanner.nextLine();

        System.out.println("Oh how interesting, tell me more!");

        String message2 = scanner.nextLine();

        System.out.println("Thanks for sharing!");

    }
}
