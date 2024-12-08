package Classes;

import Interfaces.Participant;

import java.util.ArrayList;
import java.util.List;

public class Team implements Participant {
    private final String name;
    private final List<Player> playersTeam = new ArrayList<>();
    private final List<Tournament> tournamentsRegistered = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPuntuation(String category) {
        double media = 0.0;
        for (Player player : playersTeam) {
            media += player.getPuntuation(category);
        }
        if (!playersTeam.isEmpty()) {
            media = media / playersTeam.size();
        }
        return media;
    }

    public List<Player> getPlayersTeam() {
        return playersTeam;
    }

    public List<Tournament> getTournamentsRegistered() {
        return tournamentsRegistered;
    }
}