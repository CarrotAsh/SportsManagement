package Commands;

import Classes.Administrator;
import Classes.OptionsMenu;
import Classes.Tornament;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class TornamentCreate extends Command{
    public TornamentCreate() {
        super("tournament-create");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Administrator;
        assert arguments.length==2;
        arguments = arguments[1].split(";");
        assert arguments.length==5; // nombre;fIn;fFin;liga;deporte
        // assert no existe torneo
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Tornament tornament = new Tornament(arguments[0], LocalDate.parse(arguments[1], format),LocalDate.parse(arguments[2], format),arguments[3],arguments[4]);
        OptionsMenu.tornaments.add(tornament);
    }
}
