package Classes;

import java.time.LocalDate;
import java.util.List;

public class Tornament {
    private final String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private final String league;
    private final String sport;
    //Lista con los participantes

    public Tornament(String name, LocalDate startDate, LocalDate endDate, String league, String sport){
        this.name=name;
        this.startDate=startDate;
        this.endDate=endDate;
        this.league=league;
        this.sport=sport;
    }

    public String getName() {
        return name;
    }
}
