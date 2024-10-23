package Classes;

import java.time.LocalDate;
import java.util.List;

public class Tournament {
    private final String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private final String league;
    private final String sport;
    //Lista con los participantes
    private List<Player> participatingPlayers;
    private List<Team> participatingTeams;

    public Tournament(String name, LocalDate startDate, LocalDate endDate, String league, String sport){
        this.name=name;
        this.startDate=startDate;
        this.endDate=endDate;
        this.league=league;
        this.sport=sport;
    }

    public String getName() {
        return name;
    }

    public List<Player> getParticipatingPlayers() {
        return participatingPlayers;
    }

    public List<Team> getParticipatingTeams() {
        return participatingTeams;
    }

    public boolean inProgress(){
        Boolean inProgress=false;
        LocalDate today = LocalDate.now();;
        if (today.isEqual(startDate) || today.isEqual(endDate) || (today.isAfter(startDate) && today.isBefore(endDate)) ){
            inProgress=true;

        }
        return  inProgress;
    }
}
