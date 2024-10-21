package Classes;

import java.util.List;

public class Team {
    private final String name;
    //private final Administrator creatorUser;
    private List<Player> playersTeam;

    public Team(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayersTeam() {
        return playersTeam;
    }
}