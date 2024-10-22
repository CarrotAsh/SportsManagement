package Commands;
import Classes.Administrator;
import Classes.OptionsMenu;
import Classes.Player;
import Classes.Team;

public class TeamCreate extends Command{

    public TeamCreate() {
        super("team-create");
    }


    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Administrator;
        assert arguments.length==2;
        //assert si el equipo no existe ; Crear metodo en la clase command
        Team team = new Team(arguments[1], new Administrator(OptionsMenu.loggedUser.getUserName(),OptionsMenu.loggedUser.getPassword()));
        OptionsMenu.teams.add(team);
    }
}
