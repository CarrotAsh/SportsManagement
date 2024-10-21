package Commands;

import Classes.Administrator;
import Classes.OptionsMenu;
import Classes.Player;

public class TeamDelete extends Command{
    public TeamDelete() {
        super("team-delete");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Administrator;
        assert arguments.length==2;
        //int i= getTeamPosition(arguments[1]); crear metodo en la clase command
        //assert solo puede borrarse si no está en partido o en equipo en partido -- Mas adelante
        //OptionsMenu.teams.remove(i);
    }
}

