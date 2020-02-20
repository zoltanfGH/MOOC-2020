
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String words = scanner.nextLine();
            if (words.equals("")){
                break;
            }
            String[] wordsArray = words.split(" ");

            for (String word: wordsArray) {
                if (word.contains("av")){
                    System.out.println(word);
                }

            }
        }
    }
}
