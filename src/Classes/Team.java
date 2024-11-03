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
        double media=0.0;
        for (int i = 0; i < playersTeam.size(); i++) {
            media+=playersTeam.get(i).getScore();
        }
        return media/playersTeam.size();
    }

    public double getWinMatch(){
        double media=0.0;
        for (int i = 0; i < playersTeam.size(); i++) {
            media+=playersTeam.get(i).getWinMatch();
        }
        return media/playersTeam.size();
    }

    public double getAssistScore(){
        double media=0.0;
        for (int i = 0; i < playersTeam.size(); i++) {
            media+=playersTeam.get(i).getAssistScore();
        }
        return media/playersTeam.size();
    }

    public double getTournamentsWin(){
        double media=0.0;
        for (int i = 0; i < playersTeam.size(); i++) {
            media+=playersTeam.get(i).getTournamentsWin();
        }
        return media/playersTeam.size();
    }

    public double getMoneyWin() {
        double media=0.0;
        for (int i = 0; i < playersTeam.size(); i++) {
            media+=playersTeam.get(i).getMoneyWin();
        }
        return media/playersTeam.size();
    }

    public List<Player> getPlayersTeam() {
        return playersTeam;
    }

    public List<Tournament> getTournamentsRegistered() {
        return tournamentsRegistered;
    }
}