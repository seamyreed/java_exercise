package exercise7;

/**
 * Created by hyojeongyoon on 2016. 6. 26..
 */
public class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i]+",");
        }
    }
}


class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    /**
     * (1) 배열 SutdaCard를 적절히 초기화 하시오.
     */
    public SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int number = i%10 + 1;
            boolean isKwang = false;

            if (i < 10 && (number == 1 || number == 3 || number == 8)) {
                isKwang = true;
            }

            cards[i] = new SutdaCard(number, isKwang);
        }
    }
}


class SutdaCard {
    int number;
    boolean isKwang;

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