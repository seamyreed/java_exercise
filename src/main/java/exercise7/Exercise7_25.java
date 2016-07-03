package exercise7;

import com.sun.xml.internal.xsom.impl.WildcardImpl;

/**
 * Created by hyojeongyoon on 2016. 7. 3..
 */
public class Exercise7_25 {

    /**
     * 답지 봤음 와 생소한 이 문법.
     * TODO : 다시 보자.
     *
     * @param args
     */
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        System.out.println(inner.iv);
    }
}


class Outer {
    class Inner {
        int iv = 100;
    }
}
