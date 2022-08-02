package Page311.Using.Default.Methods;

interface Playable {

    void play();

    default void quit() {
        System.out.println("Sorry, quitting is not allowed.");
    }
}
