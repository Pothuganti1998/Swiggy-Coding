public class Main {
    public static void main(String[] args) {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);

        Arena arena = new Arena(playerA, playerB);
        arena.startFight();
    }
}
