package Commands;

import Classes.Administrator;
import Classes.OptionsMenu;
import Classes.Player;

public class TournamentAdd extends Command{
    public TournamentAdd() {
        super("tournament-add");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Player;

    }
}
