package exercise7;

/**
 * Created by hyojeongyoon on 2016. 7. 3..
 */
public class Exercise7_7 {
    /**
     * 1. 호출되는 생성자 순서
     * Child() -> Child(int x) -> Parent() -> Parent(int x)
     * <p>
     * 2. 출력값
     * 200
     */

    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("x=" + c.getX());
    }
}


class Parent {
    int x = 100;

    Parent() {
        this(200);
    }

    Parent(int x) {
        this.x = x;
    }

    int getX() {
        return x;
    }
}


class Child extends Parent {
    int x = 3000;

    Child() {
        this(1000);
    }

    Child(int x) {
        this.x = x;
    }
}
