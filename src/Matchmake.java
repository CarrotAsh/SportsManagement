public class Matchmake {

    private Player player1;
    private Player player2;

    public Matchmake(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String toString() {
        return player1.getName() + " vs " + player2.getName();
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

}
