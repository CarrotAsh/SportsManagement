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
        int i= getTeamPosition(arguments[1]);
        //assert solo puede borrarse si no está en partido -- mas adelante
        OptionsMenu.teams.remove(i);
    }
}

