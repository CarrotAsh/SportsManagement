package Commands;

import Classes.Administrator;
import Options.OptionsMenu;

public class TournamentDelete extends Command {
    public TournamentDelete() {
        super("tournament-delete");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.getLoggedUser() instanceof Administrator;
        assert arguments.length==2;
        int i = getPositionInList(arguments[1], OptionsMenu.getTournaments());
        OptionsMenu.getTournaments().remove(i);
    }
}
