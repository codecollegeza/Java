package Page305b.Using.Interface.As.Type.Complex;

public class CardDeck implements Dealable {

    @Override
    public void deal(int cards) {
        System.out.println("Dealing" + cards);
    }

    @Override
    public void startGame(Dealable deck, String game_name) {
        switch (game_name) {
            case "Poker" -> deck.deal(5);
            case "Hearts" -> deck.deal(13);
            case "Gin" -> deck.deal(10);
            default -> {
            }
        }
    }
}
