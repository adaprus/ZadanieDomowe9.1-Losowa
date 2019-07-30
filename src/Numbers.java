import java.util.Random;

public class Numbers {
    public static void main(String[] args) {
        NumbersUtils utils = new NumbersUtils();
        int[] array = utils.generateArray();
        utils.showAndReverse(array);
    }
}
