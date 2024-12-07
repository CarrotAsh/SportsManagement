package Classes;

import Interfaces.Participant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Player extends User implements Participant {
    private final String name;
    private final HashMap<String, Double> puntuation = new HashMap<>();
    private String team = null;
    private final List<Tournament> tournamentsRegistered = new ArrayList<>();

    public Player(String userName, String password, String name, double score, double winMatch, double assistScore, double tournamentsWin, double moneyWin) {
        super(userName, password);
        this.name = name;
        this.puntuation.put("score", score);
        this.puntuation.put("winMatch", winMatch);
        this.puntuation.put("assistScore", assistScore);
        this.puntuation.put("tournamentsWin", tournamentsWin);
        this.puntuation.put("moneyWin", moneyWin);
    }

    public String getName() {
        return name;
    }

    public double getPuntuation(String category){
        return puntuation.get(category);
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
        return "{\"name\": " + name + ", \"score\": " + puntuation.get("score") + ", \"winMatch\": " + puntuation.get("winMatch") + ", \"assistScore\": " + puntuation.get("assistScore") + ", \"tournamentsWin\": " + puntuation.get("tournamentsWin") + ", \"moneyWin\": " + puntuation.get("moneyWin") + '}';
    }
}
