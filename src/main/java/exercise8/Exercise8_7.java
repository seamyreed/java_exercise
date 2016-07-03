package exercise8;

/**
 * Created by hyojeongyoon on 2016. 7. 3..
 */
public class Exercise8_7 {

    /**
     *
     * 실행결과 적기
     *
     * 1
     *
     * exit 만나면 걍 끗
     *
     * @param args
     */
    public static void main(String[] args) {
        method(true);
        method(false);
    }

    static void method(boolean b) {
        try {
            System.out.println(1);
            if (b) System.exit(0);
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
