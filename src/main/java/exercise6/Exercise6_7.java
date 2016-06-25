package exercise6;

/**
 * Created by hyojeongyoon on 2016. 6. 25..
 */
public class Exercise6_7 {

    public static void main(String[] args) {
        MyPoint point = new MyPoint(1, 1);

        // p와 (2, 2)의 거리를 구한다.
        System.out.println(point.getDistance(2, 2));
    }
}

class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 두 점 (x, y)와 (x1, y1)간의 거리를 구한다.
    double getDistance(int x, int y) {
        double diffX = Math.abs(x - this.x);
        double diffY = Math.abs(y - this.y);
        return Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
    }
}
