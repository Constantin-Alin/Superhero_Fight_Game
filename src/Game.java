public class Game {
    public static void main(String[] args) throws InterruptedException {
        Superman superman = new Superman("Superman", 45);
        Batman batman = new Batman("Batman", 30);
        Spiderman spiderman = new Spiderman("Spiderman", 40);
        batman.fight(spiderman);
    }
}
