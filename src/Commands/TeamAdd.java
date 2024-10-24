package Commands;

import Classes.Administrator;
import Classes.OptionsMenu;
import Classes.Player;
import Classes.Team;

public class TeamAdd extends Command{
    public TeamAdd() {
        super("team-add");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Administrator;
        assert arguments.length==2;
        arguments = arguments[1].split(";");
        assert arguments.length==2; // player;team
        Player player = OptionsMenu.players.get(getPositionInList(arguments[0],OptionsMenu.players));
        assert player.getTeam()==null;
        Team team = OptionsMenu.teams.get(getPositionInList(arguments[1],OptionsMenu.teams));
        team.getPlayersTeam().add(player);
        player.setTeam(team);
    }
}
