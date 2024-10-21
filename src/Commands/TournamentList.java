package Commands;

import Classes.Administrator;
import Classes.OptionsMenu;
import Classes.Player;

public class TournamentList extends Command{

    public TournamentList() {
        super("tournament-list");
    }

    @Override
    public void execute(String[] arguments) {
        assert arguments.length==1;
        if (OptionsMenu.loggedUser instanceof Administrator){
            //Como se comporta en admin
        } else if (OptionsMenu.loggedUser instanceof Player) {
            //Como se comporta en player
        }else {
            //Como se comporta si no está logeado
        }

    }
}
