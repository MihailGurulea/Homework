import java.util.Random;

public class TestCard {
    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card();
        Random rand = new Random();

        card1.setCardValue(rand.nextInt(13) + 1);
        Card.setFinalValue(card1);
        card1.setCardSuite(rand.nextInt(4) + 1);
        Card.setFinalSuite(card1);
        card2.setCardValue(rand.nextInt(13) + 1);
        Card.setFinalValue(card2);
        card2.setCardSuite(rand.nextInt(4) + 1);
        Card.setFinalSuite(card2);

        Card.displayCard(card1);
        Card.displayCard(card2);
    }
}
