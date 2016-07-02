package exercise6;

/**
 * Created by hyojeongyoon on 2016. 6. 25..
 */
public class Exercise6_18 {

}

/**
 * 6_18
 * 다음 코드중 컴파일 에러가 발생하는 라인과 이유를 설명하기
 *
 * A. iv는 인스턴스변수는 클래스변수에 대입 할 수 없다. 클래스변수는 인스턴스 생성 없이 쓸 수 있어야 하므로
 * B. 클래스메소드 안에서 인스턴스 변수를 사용 할 수 없다. 클래스메소드는 인스턴스 생성 없이 쓸 수 있어야 하므로
 * D. 클래스메소드 안에서 인스턴스 메소드를 호출 할 수 없다. 클래스메소드는 인스턴스 생성없이 쓸 수 있어야 하므로
 */
//class MemberCall{
//    int iv = 10;
//    static int cv = 20;
//
//    int iv2 = cv;
//    static int cv2 = iv; // 라인 A
//
//    static void staticMethod1() {
//        System.out.println(cv);
//        System.out.println(iv); // 라인 B
//    }
//
//    void instanceMethod1() {
//        System.out.println(cv);
//        System.out.println(iv); // 라인 C
//    }
//
//    static void staticMethod2() {
//        staticMethod1();
//        instanceMethod1(); // 라인 D
//    }
//
//    void instanceMethod2() {
//        staticMethod1();
//        instanceMethod1(); // 라인 E
//    }
//}
