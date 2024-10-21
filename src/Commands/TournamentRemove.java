package Commands;

import Classes.Administrator;
import Classes.OptionsMenu;
import Classes.Player;

public class TournamentRemove extends Command{
    public TournamentRemove() {
        super("tournament-remove");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Player;

    }
}
