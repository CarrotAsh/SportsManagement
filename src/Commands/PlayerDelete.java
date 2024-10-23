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
        Player player = OptionsMenu.players.get(i);
        boolean active = false;
        int j=0;
        while (!active && j<player.getTournamentsRegistered().size()){
            if (player.getTournamentsRegistered().get(j).inProgress()){
                active=true;
            }
        }
        if (!active){
            OptionsMenu.players.remove(i);
        }else{
            System.out.println("No se puede borrar: Tiene torneo activo");
        }

    }
}

