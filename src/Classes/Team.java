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

    public double getPuntuation(String category){
        double average = 0.0;
        for (Player player : playersTeam) {
            average += player.getPuntuation(category);
        }
        if (!playersTeam.isEmpty()){
            average = average/playersTeam.size();
        }
        return average;
    }

    public List<Player> getPlayersTeam() {
        return playersTeam;
    }

    public List<Tournament> getTournamentsRegistered() {
        return tournamentsRegistered;
    }
}