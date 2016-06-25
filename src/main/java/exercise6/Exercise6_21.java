package exercise6;

/**
 * Created by hyojeongyoon on 2016. 6. 26..
 */
public class Exercise6_21 {

    public static void main(String[] args) {
        MyTv myTv = new MyTv();

        myTv.channel = 100;
        myTv.volume = 0;
        System.out.println("CH:" + myTv.channel + ", VOL:" + myTv.volume);

        myTv.channelDown();
        myTv.volumeDown();
        System.out.println("CH:" + myTv.channel + ", VOL:" + myTv.volume);

        myTv.volume = 100;
        myTv.channelUp();
        myTv.volumeUp();
        System.out.println("CH:" + myTv.channel + ", VOL:" + myTv.volume);
    }
}


class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    /**
     * (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
     */
    void turnOnOff() {
        isPowerOn = !isPowerOn;
    }

    /**
     * (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다.
     */
    void volumeUp() {
        if (volume < MAX_VOLUME) {
            volume++;
        }
    }

    /**
     * (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소시킨다.
     */
    void volumeDown() {
        if (volume > MIN_VOLUME) {
            volume--;
        }
    }

    /**
     * (4) channel의 값을 1증가시킨다.
     * 만일 channel이 MAX_CHANNEL이면 channel의 값을 MIN_CHANNEL로 바꾼다.
     */
    void channelUp() {
        channel++;
        if (channel == MAX_CHANNEL) {
            channel = MIN_CHANNEL;
        }
    }

    /**
     * (5) channel의 값을 1감소시킨다.
     * 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
     */
    void channelDown() {
        channel--;
        if (channel == MIN_CHANNEL) {
            channel = MAX_CHANNEL;
        }
    }
}
