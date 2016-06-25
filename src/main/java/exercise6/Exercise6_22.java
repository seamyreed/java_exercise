package exercise6;

/**
 * Created by hyojeongyoon on 2016. 6. 26..
 */
public class Exercise6_22 {

    public static void main(String[] args) {
        String string = "123";
        System.out.println(string + "는 숫자입니까?" +isNumber(string));

        string = "1234o";
        System.out.println(string + "는 숫자입니까?" +isNumber(string));

        string = null;
        System.out.println(string + "는 숫자입니까?" +isNumber(string));

        string = "";
        System.out.println(string + "는 숫자입니까?" +isNumber(string));
    }

    /**
     * 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
     * 모두 숫자로만 이루어져 있으면 true를 반환하고
     * 그렇지 않으면 false를 반환한다.
     * 만일 주어진 문자열이 null이거나 빈문자열 ""이라면 false를 반환한다.
     *
     * TODO 답지는 다를 거 같은데 확인하기...
     * @param string
     * @return
     */
    private static boolean isNumber(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
