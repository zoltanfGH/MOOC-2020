
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(3);
        integers.add(4);
        integers.add(6);
        integers.add(7);
        integers.add(9);
        integers.add(5);
        printNumbersInRange(integers,5,10);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for (int number: numbers) {
            if (number>=lowerLimit && number<=upperLimit){
                System.out.println(number);
            }
        }
    }
    
}
