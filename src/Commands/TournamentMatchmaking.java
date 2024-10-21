package Commands;

import Classes.Administrator;
import Classes.OptionsMenu;

public class TournamentMatchmaking extends Command{
    public TournamentMatchmaking() {
        super("tournament-matchmaking");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Administrator;

    }
}
