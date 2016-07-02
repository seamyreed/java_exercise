package exercise7;

/**
 * Created by hyojeongyoon on 2016. 6. 26..
 */
public class SutdaCard {
    final int number;
    final boolean isKwang;

    public SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int number, boolean isKwang) {
        this.number = number;
        this.isKwang = isKwang;
    }

    public String toString() {
        return number + (isKwang ? "K" : "");
    }
}