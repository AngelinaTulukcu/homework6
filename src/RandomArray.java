import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        final int LENGTH = 5;

        int[] numbers = new int[LENGTH];

        Random rd = new Random();

        for (int i = 0; i < LENGTH; i++) {
            numbers[i] = rd.nextInt();
        }

        
        for (int i = 0; i < LENGTH; i++) {
            System.out.println(numbers[i]);
        }
    }
}
