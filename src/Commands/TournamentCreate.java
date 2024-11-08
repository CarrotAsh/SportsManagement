package Commands;

import Classes.Administrator;
import Options.OptionsMenu;
import Classes.Tournament;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class TournamentCreate extends Command {
    public TournamentCreate() {
        super("tournament-create");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Administrator;
        assert arguments.length==2;
        arguments = arguments[1].split(";"); //name;startDate;endDate;league;sport;category
        assert arguments.length==6 && !existInList(arguments[0], OptionsMenu.tournaments);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try{
            LocalDate startDate=LocalDate.parse(arguments[1], format);
            LocalDate endDate=LocalDate.parse(arguments[2], format);
            Tournament tournament = new Tournament(arguments[0],startDate,endDate,arguments[3],arguments[4], arguments[5]);
            OptionsMenu.tournaments.add(tournament);
        }catch (Exception e){
            System.out.println("Fechas incorrectas");
        }
    }
}
