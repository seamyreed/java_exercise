package exercise7;

/**
 * Created by hyojeongyoon on 2016. 7. 3..
 */
public class Exercise7_15 {

    /**
     *
     * 형변환이 옳지 않은 것은?
     *
     * e.
     * t = (Tank) u;
     *
     * u는 GroundUnit 인스턴스를 가리키는 참조 변수인데, 그 하위 클래스인 Tank 로 캐스팅 할 수 없음.
     */

    public static void main(String[] args) {

        Unit u = new GroundUnit();
        Tank t = new Tank();
        AirCraft ac = new AirCraft();

        t = (Tank) u;
        // ClassCastExeption 발생
    }
}


class Unit {
}


class AirUnit extends Unit {
}


class GroundUnit extends Unit {
}


class Tank extends GroundUnit {
}


class AirCraft extends AirUnit {
}