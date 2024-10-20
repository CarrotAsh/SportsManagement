package Classes;

import java.util.Date;
import java.util.List;

public class Tornament {
    private final String name;
    private Date startDate;
    private Date endDate;
    //¿Liga clase o string?
    private String sport;
    //Lista con los participantes

    public Tornament(String name, Date startDate, Date endDate, String sport){
        this.name=name;
        this.startDate=startDate;
        this.endDate=endDate;
        this.sport=sport;
    }
}
