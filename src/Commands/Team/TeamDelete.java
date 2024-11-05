package Commands.Team;

import Classes.Administrator;
import Commands.Command;
import Options.OptionsMenu;
import Classes.Team;

public class TeamDelete extends Command {
    public TeamDelete() {
        super("team-delete");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Administrator;
        assert arguments.length==2;
        int i= getPositionInList(arguments[1], OptionsMenu.teams);
        Team team = OptionsMenu.teams.get(i);
        boolean active = false;
        int j=0;
        while (!active && j<team.getTournamentsRegistered().size()){
            if (team.getTournamentsRegistered().get(j).inProgress()){
                active=true;
            }
        }
        if (!active){
            OptionsMenu.teams.remove(i);
        }else{
            System.out.println("No se puede borrar: Tiene torneo activo");
        }

    }
}

