package Commands;

import Classes.Administrator;
import Options.OptionsMenu;
import Classes.Player;
import Classes.Team;

public class TeamAdd extends Command {
    public TeamAdd() {
        super("team-add");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.getLoggedUser() instanceof Administrator;
        assert arguments.length == 2;
        arguments = arguments[1].split(";");
        assert arguments.length == 2; // player;team
        Player player = OptionsMenu.getPlayers().get(getPositionInList(arguments[0], OptionsMenu.getPlayers()));
        assert player.getTeam() == null;
        Team team = OptionsMenu.getTeams().get(getPositionInList(arguments[1], OptionsMenu.getTeams()));
        team.getPlayersTeam().add(player);
        player.setTeam(team.getName());
    }
}
