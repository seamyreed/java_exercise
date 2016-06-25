package exercise6;

/**
 * Created by hyojeongyoon on 2016. 6. 26..
 */
public class Exercise6_20 {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }

    private static int[] shuffle(int[] original) {
        int[] result = new int[9];
        for (int i = 0; i < original.length; i++) {
            int randomPosition = (int) ((Math.random() * 9) + 1);
            result[i] = original[randomPosition];
        }
        return result;
    }
}
