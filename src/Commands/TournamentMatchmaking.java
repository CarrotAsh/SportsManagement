package Commands;

import Classes.Administrator;
import Classes.Matchmake;
import Classes.OptionsMenu;
import Classes.Player;

public class TournamentMatchmaking extends Command{
    public TournamentMatchmaking() {
        super("tournament-matchmaking");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Administrator;


    }
}
