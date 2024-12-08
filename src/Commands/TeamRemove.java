package Commands;

import Classes.Administrator;
import Options.OptionsMenu;
import Classes.Player;

public class TeamRemove extends Command {
    public TeamRemove() {
        super("team-remove");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.getLoggedUser() instanceof Administrator;
        assert arguments.length==2;
        arguments = arguments[1].split(";");
        assert arguments.length==2;// namePlayer;nameTeam

        int i = getPositionInList(arguments[1], OptionsMenu.getTeams());
        int j = getPositionInList(arguments[0], OptionsMenu.getTeams().get(i).getPlayersTeam());
        OptionsMenu.getTeams().get(i).getPlayersTeam().remove(j);
        Player player = OptionsMenu.getPlayers().get(getPositionInList(arguments[0],OptionsMenu.getPlayers()));
        player.setTeam(null);
    }
}
