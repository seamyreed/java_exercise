package exercise6;

/**
 * Created by hyojeongyoon on 2016. 6. 26..
 */
public class Exercise6_23 {
    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:" + max(data));
        System.out.println("최대값:" + max(null));
        System.out.println("최대값:" + max(new int[]{}));
    }

    /**
     * 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
     * 만일 주어진 배열이 null이거나 크기가 0인 경우 -999999를 반환한다.
     * @param data
     * @return
     */
    private static int max(int[] data) {
        int max = -999999;

        if (data == null || data.length == 0) {
            return max;
        }

        for (int i = 0; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
            }
        }
        return max;
    }
}
