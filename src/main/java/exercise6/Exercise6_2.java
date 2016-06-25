package exercise6;

public class Exercise6_2 {

    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}


class SutdaCard {
    private int num;
    private boolean isKwang;

    public SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        if (num < 1 || num > 10) {
            return;
        }

        this.num = num;
    }

    public boolean isKwang() {
        return isKwang;
    }

    public void setKwang(boolean kwang) {
        isKwang = kwang;
    }

    public String info() {
        if (isKwang) {
            return num + "K";
        }

        return ""+num;
    }
}
