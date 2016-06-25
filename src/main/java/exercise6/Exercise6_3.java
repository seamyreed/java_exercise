package exercise6;

/**
 * Created by hyojeongyoon on 2016. 6. 25..
 */
public class Exercise6_3 {

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "윤효정";
        student.classNumber = 1;
        student.studentNumber = 1;
        student.korean = 100;
        student.english = 60;
        student.math = 76;

        System.out.println("이름: " + student.name);
        System.out.println("이름: " + student.getTotal());
        System.out.println("이름: " + student.getAverage());
    }
}

class Student {
    public String name;
    public int classNumber;
    public int studentNumber;
    public int korean;
    public int english;
    public int math;

    public int getTotal() {
        return korean + english + math;
    }

    public float getAverage() {
        float average = getTotal() / 3.0f;
        return Math.round(average * 10f) / 10f;
    }
}
