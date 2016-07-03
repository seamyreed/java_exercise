package exercise7;

/**
 * Created by hyojeongyoon on 2016. 7. 3..
 */
public class exercise7_20 {
    /**
     *
     * 출력순서 적기
     *
     * TODO: 멤버변수는 참조변수의 멤버변수가 호출되고, 메소드는 인스턴스의 메소드가 호출된다.
     * 멤버변수 호출되는거 또 틀렸네...
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        Parent1 p = new Child1();
        Child1 c = new Child1();
        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}


class Parent1 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}


class Child1 extends Parent1 {
    int x = 200;

    void method() {
        System.out.println("Child Method");
    }
}