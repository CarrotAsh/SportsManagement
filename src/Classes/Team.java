package Classes;

import Interfaces.Participant;

import java.util.ArrayList;
import java.util.List;

public class Team implements Participant {
    private final String name;
    private final Administrator creatorUser;
    private List<Player> playersTeam = new ArrayList<>();
    private List<Tournament> tournamentsRegistered = new ArrayList<>();

    public Team(String name, Administrator creatorUser){
        this.name=name;
        this.creatorUser=creatorUser;
    }

    public String getName() {
        return name;
    }

    public double getScore(){
        double score=0.0;
        for (int i = 0; i < playersTeam.size(); i++) {
            score+=playersTeam.get(i).getScore();
        }
        return score/playersTeam.size();
    }

    public double getWinMatch(){
        double winMatch=0.0;
        for (int i = 0; i < playersTeam.size(); i++) {
            winMatch+=playersTeam.get(i).getWinMatch();
        }
        return winMatch/playersTeam.size();
    }

    public double getAssistScore(){
        double assistScore=0.0;
        for (int i = 0; i < playersTeam.size(); i++) {
            assistScore+=playersTeam.get(i).getAssistScore();
        }
        return assistScore/playersTeam.size();
    }

    public double getTournamentsWin(){
        double tournamentsWin=0.0;
        for (int i = 0; i < playersTeam.size(); i++) {
            tournamentsWin+=playersTeam.get(i).getTournamentsWin();
        }
        return tournamentsWin/playersTeam.size();
    }

    public double getMoneyWin() {
        double moneyWin=0.0;
        for (int i = 0; i < playersTeam.size(); i++) {
            moneyWin+=playersTeam.get(i).getMoneyWin();
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