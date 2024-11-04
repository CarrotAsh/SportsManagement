package Commands.Tournament;

import Classes.Administrator;
import Commands.Command;
import Options.OptionsMenu;

public class TournamentDelete extends Command {
    public TournamentDelete() {
        super("tournament-delete");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Administrator;
        assert arguments.length==2;
        int i= getPositionInList(arguments[1], OptionsMenu.tournaments);
        OptionsMenu.tournaments.remove(i);
    }
}
