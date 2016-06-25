package exercise6;

/**
 * Created by hyojeongyoon on 2016. 6. 25..
 */
public class Exercise6_8 {

    // 코드에 정의된 변수들을 종류별로 구분해서 적으시오.
    // - 클래스변수(static변수) : width, height
    // - 인스턴스변수 : kind, number
    // - 지역변수 : 생성자 매개변수인 kind, number

    public static void main(String[] args) {
        PlayingCard card = new PlayingCard(1, 1);
    }
}

class PlayingCard {
    int kind;
    int number;

    static int width;
    static int height;

    public PlayingCard(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}