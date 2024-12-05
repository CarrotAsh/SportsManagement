package Classes;

import Interfaces.Participant;

import java.util.ArrayList;
import java.util.List;

public class Team implements Participant {
    private final String name;
    private final List<Player> playersTeam = new ArrayList<>();
    private final List<Tournament> tournamentsRegistered = new ArrayList<>();

    public Team(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public double getScore(){
        double score=0.0;
        for (Player player : playersTeam) {
            score += player.getScore();
        }
        return score/playersTeam.size();
    }

    public double getWinMatch(){
        double winMatch=0.0;
        for (Player player : playersTeam) {
            winMatch += player.getWinMatch();
        }
        return winMatch/playersTeam.size();
    }

    public double getAssistScore(){
        double assistScore=0.0;
        for (Player player : playersTeam) {
            assistScore += player.getAssistScore();
        }
        return assistScore/playersTeam.size();
    }

    public double getTournamentsWin(){
        double tournamentsWin=0.0;
        for (Player player : playersTeam) {
            tournamentsWin += player.getTournamentsWin();
        }
        return tournamentsWin/playersTeam.size();
    }

    public double getMoneyWin() {
        double moneyWin=0.0;
        for (Player player : playersTeam) {
            moneyWin += player.getMoneyWin();
        }
        return moneyWin/playersTeam.size();
    }

    public List<Player> getPlayersTeam() {
        return playersTeam;
    }

    public List<Tournament> getTournamentsRegistered() {
        return tournamentsRegistered;
    }
}