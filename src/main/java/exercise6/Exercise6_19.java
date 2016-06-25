package exercise6;

/**
 * Created by hyojeongyoon on 2016. 6. 26..
 */
public class Exercise6_19 {

    public static void change(String string) {
        string += "456";
    }

    /**
     * 6_19
     * 실행 결과 예측
     * =================
     * ABC123
     * After change:ABC123
     * =================
     * change 이후에도 string 지역변수의 값은 변하지 않는다.
     */
    public static void main(String[] args) {
        String string = "ABC123";
        System.out.println(string);
        change(string);
        System.out.println("After change:" + string);
    }
}
