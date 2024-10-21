package Commands;

import Classes.Administrator;
import Classes.OptionsMenu;
import Classes.Player;

public class PlayerDelete extends Command{
    public PlayerDelete() {
        super("player-delete");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Administrator;
        assert arguments.length==2;
        int i = getPlayerPosition(arguments[1]);
        //assert solo puede borrarse si no está en partido o en equipo en partido
        OptionsMenu.players.remove(i);
    }
}

