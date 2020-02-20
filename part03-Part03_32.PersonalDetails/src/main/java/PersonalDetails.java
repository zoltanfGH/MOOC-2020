
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birthYear = 0;
        String name = "";
        int counter = 0;

        while (true){
            String enteredText = scanner.nextLine();
            if (enteredText.equals("")){
                break;
            }
            String [] wordsArray = enteredText.split(",");

            if (name.length() < wordsArray[0].length()){
                name = wordsArray[0];
            }
            birthYear += Integer.valueOf(wordsArray[1]);
            counter++;
        }

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (double) birthYear/counter);
    }
}
