package exercise7;

/**
 * Created by hyojeongyoon on 2016. 6. 26..
 */
public class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    /**
     * (1) 배열 SutdaCard를 적절히 초기화 하시오.
     */
    public SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int number = i % 10 + 1;
            boolean isKwang = false;

            if (i < 10 && (number == 1 || number == 3 || number == 8)) {
                isKwang = true;
            }

            cards[i] = new SutdaCard(number, isKwang);
        }
    }

    /**
     * TODO : Collection.shuffle() 메소드 구현 살펴보기.
     * <p>
     */
    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int randomIndex = (int) (Math.random() * cards.length);
            SutdaCard tempCard = cards[i];
            cards[i] = cards[randomIndex];
            cards[randomIndex] = tempCard;
        }

        //Collections.shuffle(Arrays.asList(cards));
    }

    public SutdaCard pick(int i) {
        return cards[i];
    }

    public SutdaCard pick() {
        int randomIndex = (int) (Math.random() * cards.length);
        return cards[randomIndex];
    }
}