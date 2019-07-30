import java.util.Arrays;
import java.util.Random;

public class NumbersUtils {
    public int[] generateArray() {
        Random generator = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(100);
            System.out.printf("%d ", array[i]);
        }
        return array;
    }

    public void showAndReverse(int[] array) {
        System.out.println();
        for (int i = 0; i < 2 * array.length; i++) {
            if (i < array.length) {
                System.out.printf("%d ", array[i]);
            } else {
                System.out.printf("%d ", array[2 * array.length - i - 1]);
            }
        }
    }
}
