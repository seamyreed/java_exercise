package exercise7;

/**
 * Created by hyojeongyoon on 2016. 7. 3..
 */
class MyTv2 {
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        prevChannel = this.channel;
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * 7-11
     */
    public void gotoPrevChannel() {
        int tempChannel = channel;
        channel = prevChannel;
        prevChannel = tempChannel;
    }
}
