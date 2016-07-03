package exercise8;

/**
 * Created by hyojeongyoon on 2016. 7. 3..
 */
public class Exercise8_9 {

    public static void main(String[] args) throws Exception {
        throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
    }
}

class UnsupportedFunctionException extends RuntimeException {
    private final int ERR_CODE = 100;
    private String errorMessage;

    public UnsupportedFunctionException(String s, int i) {
        errorMessage = s;
    }

    public int getErrorCode() {
        return ERR_CODE;
    }

    @Override
    public String getMessage() {
        return "[" + ERR_CODE + "]" + errorMessage;
    }
}
