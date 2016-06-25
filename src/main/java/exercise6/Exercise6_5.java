package exercise6;

/**
 * Created by hyojeongyoon on 2016. 6. 25..
 */
public class Exercise6_5 {

    public static void main(String[] args) {
        Student1 student = new Student1("윤효정", 1, 1, 100, 60, 76);
        System.out.println(student.info());
    }
}

class Student1 {
    public String name;
    public int classNumber;
    public int studentNumber;
    public int korean;
    public int english;
    public int math;

    public Student1(String name,
                    int classNumber,
                    int studentNumber,
                    int korean,
                    int english,
                    int math) {
        this.name = name;
        this.classNumber = classNumber;
        this.studentNumber = studentNumber;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public int getTotal() {
        return korean + english + math;
    }

    public float getAverage() {
        float average = getTotal() / 3.0f;
        return Math.round(average * 10f) / 10f;
    }

    public String info() {

        return this.name + "," +
                this.classNumber + "," +
                this.studentNumber + "," +
                this.korean + "," +
                this.english + "," +
                this.math + "," +
                this.getTotal() + "," +
                this.getAverage();
    }
}

