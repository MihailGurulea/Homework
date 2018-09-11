public class Card {
    private int cardValue; // random number between 1 and 13
    private String explicitCardValue; // Name of the card, ex: Ace
    private int cardSuite; // random number between 1 and 4
    private String explicitCardSuite; // Suite of the card, ex: Hearts

    public Card() {
        this.cardValue = cardValue;
        this.cardSuite = cardSuite;
        this.explicitCardValue = explicitCardValue;
        this.explicitCardSuite = explicitCardSuite;
    }

    public static void setFinalSuite(Card card) {
        switch (card.getCardSuite()) {
            case 1:
                card.setExplicitCardSuite("Spades");
                break;
            case 2:
                card.setExplicitCardSuite("Clubs");
                break;
            case 3:
                card.setExplicitCardSuite("Hearts");
                break;
            case 4:
                card.setExplicitCardSuite("Diamonds");
                break;
        }
    }

    public static void setFinalValue(Card card) {
        switch (card.getCardValue()) {
            case 1:
                card.setExplicitCardValue("Ace");
                break;
            case 2:
                card.setExplicitCardValue("Two");
                break;
            case 3:
                card.setExplicitCardValue("Three");
                break;
            case 4:
                card.setExplicitCardValue("Four");
                break;
            case 5:
                card.setExplicitCardValue("Five");
                break;
            case 6:
                card.setExplicitCardValue("Six");
                break;
            case 7:
                card.setExplicitCardValue("Seven");
                break;
            case 8:
                card.setExplicitCardValue("Eight");
                break;
            case 9:
                card.setExplicitCardValue("Nine");
                break;
            case 10:
                card.setExplicitCardValue("Ten");
                break;
            case 11:
                card.setExplicitCardValue("Jack");
                break;
            case 12:
                card.setExplicitCardValue("Queen");
                break;
            case 13:
                card.setExplicitCardValue("King");
                break;
        }
    }

    public static void displayCard(Card card) {
        System.out.println("Your card: " + card.getExplicitCardValue() + " of " + card.getExplicitCardSuite());
    }

    public int getCardValue() {
        return cardValue;
    }

    public String getExplicitCardValue() {
        return explicitCardValue;
    }

    public int getCardSuite() {
        return cardSuite;
    }

    public String getExplicitCardSuite() {
        return explicitCardSuite;
    }

    public void setCardValue(int value) {
        this.cardValue = value;
    }

    public void setCardSuite(int value) {
        this.cardSuite = value;
    }

    public void setExplicitCardValue(String value) {
        this.explicitCardValue = value;
    }

    public void setExplicitCardSuite(String suite) {
        this.explicitCardSuite = suite;
    }

}
