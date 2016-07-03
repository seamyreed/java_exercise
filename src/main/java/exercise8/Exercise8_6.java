package exercise8;

/**
 * Created by hyojeongyoon on 2016. 7. 3..
 */
public class Exercise8_6 {

    /**
     * 실행결과 순서대로 적기.
     * <p>
     * 3 출력되고 NullPointerException() 발생
     *
     * 아 틀렸네. method2()에서 발생한 예외가 method1()에서 예외처리했으니 5 실행했네.
     *
     */
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println(5);
        }
    }

    static void method1() {
        try {
            method2();
            System.out.println(1);
        } catch (ArithmeticException e) {
            System.out.println(2);
        } finally {
            System.out.println(3);
        }
        System.out.println(4);
    } // method1()

    static void method2() {
        throw new NullPointerException();
    }
}
