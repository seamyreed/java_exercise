package exercise8;

/**
 * Created by hyojeongyoon on 2016. 7. 3..
 */
public class Exercise8_4 {

    /**
     *
     *
     * c. e.
     *
     * 정정 c - 두번째 catch문에 NumberException 은 타지 않는다.
     *
     */

    static void method() throws InvalidNumberException, NotANumberException {
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}


class NumberException extends RuntimeException {
}


class InvalidNumberException extends NumberException {
}


class NotANumberException extends NumberException {
}
