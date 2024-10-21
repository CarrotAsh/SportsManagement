package Commands;

import Classes.Administrator;
import Classes.OptionsMenu;

public class TournamentDelete extends Command{
    public TournamentDelete() {
        super("tournament-delete");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Administrator;
        assert arguments.length==2;
        //int i= geTeamPosition(arguments[1]);
        //OptionsMenu.tornaments.remove(i);
    }
}
