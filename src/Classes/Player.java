package Classes;

import Interfaces.Participant;

import java.util.ArrayList;
import java.util.List;

public class Player extends User implements Participant {
    private final String name;
    private final String surname;
    private final String DNI;
    private double score;
    private double winMatch;
    private double assistScore;
    private double tournamentsWin;
    private double moneyWin;
    private String team = null;
    private final List<Tournament> tournamentsRegistered = new ArrayList<>();

    public Player(String userName, String password, String name, String surname, String DNI, double score, double winMatch, double assistScore, double tournamentsWin, double moneyWin) {
        super(userName, password);
        this.name = name;
        this.surname = surname;
        this.DNI = DNI;
        this.score = score;
        this.winMatch=winMatch;
        this.assistScore=assistScore;
        this.tournamentsWin=tournamentsWin;
        this.moneyWin=moneyWin;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public double getWinMatch() {
        return winMatch;
    }

    public double getAssistScore() {
        return assistScore;
    }

    public double getTournamentsWin() {
        return tournamentsWin;
    }

    public double getMoneyWin() {
        return moneyWin;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public List<Tournament> getTournamentsRegistered() {
        return tournamentsRegistered;
    }

    @Override
    public String toString() {
        return "{\"name\": " + name + ", \"score\": " + score + ", \"winMatch\": " + winMatch + ", \"assistScore\": " + assistScore + ", \"tournamentsWin\": " + tournamentsWin + ", \"moneyWin\": " + moneyWin + '}';
    }
}
