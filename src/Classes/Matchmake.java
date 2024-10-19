package Classes;

public class Matchmake {

    private Player[] match = new Player[2];

    public Matchmake(Player local, Player visitor) {
        match[0] = local;
        match[1] = visitor;
    }

    public Player[] getMatch() { return match; }

    public String toString() {
        return match[0].getName() + " vs " + match[1].getName();
    }

}
