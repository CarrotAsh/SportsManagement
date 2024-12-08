package Classes;

import Interfaces.Nameable;
import Interfaces.Participant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tournament implements Nameable {
    private final String name;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final String league;
    private final String sport;
    private final String category;
    private final List<Participant> participants = new ArrayList<>();
    private final List<Matchmake> matchs = new ArrayList<>();

    public Tournament(String name, LocalDate startDate, LocalDate endDate, String league, String sport, String category){
        this.name=name;
        this.startDate=startDate;
        this.endDate=endDate;
        this.league=league;
        this.sport=sport;
        this.category=category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public List<Matchmake> getMatchs() {
        return matchs;
    }

    public boolean inProgress(){
        boolean inProgress=false;
        LocalDate today = LocalDate.now();
        if (today.isEqual(startDate) || today.isEqual(endDate) || (today.isAfter(startDate) && today.isBefore(endDate)) ){
            inProgress=true;

        }
        return  inProgress;
    }

    public boolean isFinish(){
        boolean isFinish=false;
        LocalDate today = LocalDate.now();
        if (today.isAfter(endDate)){
            isFinish=true;
        }
        return isFinish;
    }
}
