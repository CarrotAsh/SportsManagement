package Classes;

import java.util.List;

public class Team {
    private final String name;
    private final Administrator creatorUser;
    private List<Player> playersTeam;
    private List<Tournament> tournamentsRegistered;

    public Team(String name, Administrator creatorUser){
        this.name=name;
        this.creatorUser=creatorUser;
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayersTeam() {
        return playersTeam;
    }

    public List<Tournament> getTournamentsRegistered() {
        return tournamentsRegistered;
    }
}