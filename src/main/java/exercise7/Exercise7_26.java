package exercise7;

/**
 * Created by hyojeongyoon on 2016. 7. 3..
 */
public class Exercise7_26 {

    public static void main(String[] args) {
        Outer1.Inner inner = new Outer1.Inner();
        System.out.println(inner.iv);
    }
}


class Outer1 {
    static class Inner {
        int iv = 200;
    }
}
