package Commands.Team;

import Classes.Administrator;
import Commands.Command;
import Options.OptionsMenu;
import Classes.Player;

public class TeamRemove extends Command {
    public TeamRemove() {
        super("team-remove");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Administrator;
        assert arguments.length==2;
        arguments = arguments[1].split(";");
        assert arguments.length==2;// namePlayer;nameTeam
        int i = getPositionInList(arguments[1], OptionsMenu.teams);
        int j = getPositionInList(arguments[0], OptionsMenu.teams.get(i).getPlayersTeam());
        OptionsMenu.teams.get(i).getPlayersTeam().remove(j);
        Player player = OptionsMenu.players.get(getPositionInList(arguments[0],OptionsMenu.players));
        player.setTeam(null);
    }
}
