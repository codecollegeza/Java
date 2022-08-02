package Page305b.Using.Interface.As.Type.Complex;

public class TestGame {

    public static void main(String[] args) {
        System.out.println("Using an Interface as a Type");
        Dealable d = new CardDeck();
        d.startGame(d, "Hearts");
        d.startGame(d, "Poker");
    }

}
