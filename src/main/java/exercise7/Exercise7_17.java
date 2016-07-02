package exercise7;

/**
 * Created by hyojeongyoon on 2016. 7. 3..
 */
public class Exercise7_17 {

    /**
     * Unit 클래스를 만들고 이 클래스를 상속받도록 코드를 변경하시오.
     */
}

abstract class Unit1 {
    int x, y;

    abstract void move(int x, int y);

    abstract void stop();
}

class Marine extends Unit1 {
    void stimPack() {

    }

    void move(int x, int y) {

    }

    void stop() {

    }
}

class Tank1 extends Unit1 {
    void changeMod() {

    }

    void move(int x, int y) {

    }

    void stop() {

    }
}

class Dropship extends Unit1 {
    void load() {

    }

    void unload() {

    }

    void move(int x, int y) {

    }

    void stop() {

    }
}