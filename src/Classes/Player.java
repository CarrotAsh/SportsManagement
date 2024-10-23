package Classes;

import java.util.List;

public class Player extends User{
    private final String name;
    private final String surname;
    private final String DNI;
    private double score;
    private double winMatch;
    private double assistScore;
    private double tournamentsWin;
    private double moneyWin;
    private final Administrator creatorUser;
    private Team team = null;
    private List<Tournament> tournamentsRegistered;

    public Player(String userName, String password, String name, String surname, String DNI, double score, double winMatch, double assistScore, double tournamentsWin, double moneyWin, Administrator creatorUser) {
        super(userName, password);
        this.name = name;
        this.surname = surname;
        this.DNI = DNI;
        this.score = score;
        this.winMatch=winMatch;
        this.assistScore=assistScore;
        this.tournamentsWin=tournamentsWin;
        this.moneyWin=moneyWin;
        this.creatorUser=creatorUser;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
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
