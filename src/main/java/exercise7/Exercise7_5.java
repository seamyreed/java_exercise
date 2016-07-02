package exercise7;

/**
 * Created by hyojeongyoon on 2016. 7. 3..
 */
public class Exercise7_5 {
    /**
     * TV 클래스 컴파일 에러 나는 이유는 ?
     * -
     * 부모클래스인 Product 에서 매개변수가 있는 생성자를 만들면 컴파일러는 기본 생성자를 만들지 않는다.
     * TV 에서 기본 생성자를 만들면 super 생성자 중 매개변수 타입이 맞는 생성자가 호출되는데 이때
     * 이에 상응하는 수퍼 클래스의 생성자가 없어서 컴파일 에러가 난다.
     *
     * 해결 방법 2가지:
     * 1. TV() 생성자에서 super(int..) 를 명시한다.
     * 2. Product 기본 생성자를 만든다.
     */

    public static void main(String[] args) {
        Tv tv = new Tv();
    }

}

class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}


class Tv extends Product {
    Tv() {
        super(10);
    }

    public String toString() {
        return "Tv";
    }
}