package exercise6;

/**
 * Created by hyojeongyoon on 2016. 6. 25..
 */
public class Exercise6_6 {

    // 두 점 (x, y)와 (x1, y1)간의 거리를 구한다.
    static double getDistance(int x, int y, int x1, int y1) {
        double diffX = Math.abs(x - x1);
        double diffY = Math.abs(y - y1);
        return Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}
