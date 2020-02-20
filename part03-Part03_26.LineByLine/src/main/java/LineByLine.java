
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String words = scanner.nextLine();
            if (words.equals("")){
                break;
            }
            String[] wordsArray = words.split(" ");

            for (String word: wordsArray) {
                System.out.println(word);
            }
        }
    }
}
