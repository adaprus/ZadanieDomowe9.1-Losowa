import java.util.Random;

public class NumbersUtils {
    public int[] generateArray() {
        Random generator = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(100);
        }
        return array;
    }

    public void showAndReverse(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
            System.out.printf("%d ", array[array.length - i - 1]);
        }
    }
}
