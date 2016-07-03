package exercise8;

/**
 * Created by hyojeongyoon on 2016. 7. 3..
 */
public class Exercise8_5 {

    public static void main(String[] args) {
        method(true);
        method(false);
    }

    /**
     * 실행결과 순서대로 적기
     * <p>
     * 1
     * 3
     * 5
     * 6
     * 1
     * 2
     * 5
     * 6
     *
     */

    static void method(boolean b) {
        try {
            System.out.println(1);
            if (b) throw new ArithmeticException();
            System.out.println(2);
        } catch (RuntimeException r) {
            System.out.println(3);
            return;
        } catch (Exception e) {
            System.out.println(4);
            return;
        } finally {
            System.out.println(5);
        }
        System.out.println(6);
    }
}
