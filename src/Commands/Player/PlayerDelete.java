package Commands.Player;

import Classes.Administrator;
import Commands.Command;
import Options.OptionsMenu;
import Classes.Player;
import Classes.Team;

public class PlayerDelete extends Command {
    public PlayerDelete() {
        super("player-delete");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Administrator;
        assert arguments.length==2;
        int i = getPositionInList(arguments[1], OptionsMenu.players);
        Player player = OptionsMenu.players.get(i);

        boolean active = false;
        int j=0;
        while (!active && j<player.getTournamentsRegistered().size()){
            if (player.getTournamentsRegistered().get(j).inProgress()){
                active=true;
            }
        }

        if (player.getTeam()!=null && !active){
            Team team = player.getTeam();
            int m=0;
            while (!active && m<team.getTournamentsRegistered().size()){
                if (team.getTournamentsRegistered().get(m).inProgress()){
                    active=true;
                }
            }
        }

        if (!active){
            OptionsMenu.players.remove(i);
        }else{
            System.out.println("No se puede borrar: Tiene torneo activo");
        }
    }
}

