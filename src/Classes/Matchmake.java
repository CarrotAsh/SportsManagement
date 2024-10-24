package Classes;

public class Matchmake {

    private Participants[] match = new Participants[2];

    public Participants[] getMatch() {
        return match;
    }

    public String toString() {
        return match[0].getName() + " vs " + match[1].getName();
    }

}
