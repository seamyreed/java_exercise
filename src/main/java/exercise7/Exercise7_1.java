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