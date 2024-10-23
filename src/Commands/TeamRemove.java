package Commands;

import Classes.Administrator;
import Classes.OptionsMenu;
import Classes.Player;

public class TeamRemove extends Command{
    public TeamRemove() {
        super("team-remove");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Administrator;
        assert arguments.length==2;
        arguments = arguments[1].split(";");
        assert arguments.length==2;// namePlayer;nameTeam
        int i = getTeamPosition(arguments[1]);
        int j = getPlayerPositionInTeam(arguments[0], OptionsMenu.teams.get(i).getPlayersTeam());
        OptionsMenu.teams.get(i).getPlayersTeam().remove(j);
        Player player = OptionsMenu.players.get(getPlayerPosition(arguments[0]));
        player.setTeam(null);
    }
}
