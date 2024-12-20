package Classes;

import Interfaces.Participant;

public class Matchmake {

    private final Participant[] match = new Participant[2];

    public Participant[] getMatch() {
        return match;
    }

    public void addParticipant(Participant participant, int p) {
        match[p] = participant;
    }

    public String toString() {
        return match[0].getName() + " vs " + match[1].getName();
    }
}
