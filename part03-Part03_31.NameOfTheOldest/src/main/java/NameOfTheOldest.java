
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int greatest = 0;
        String name = "";

        while (true){
            String enteredText = scanner.nextLine();
            if (enteredText.equals("")){
                break;
            }
            String [] wordsArray = enteredText.split(",");

            if (greatest < Integer.valueOf(wordsArray[1])){
                greatest = Integer.valueOf(wordsArray[1]);
                name = wordsArray[0];
            }
        }

        System.out.println("Name of the oldest: " + name);
    }
}
