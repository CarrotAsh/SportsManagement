package Commands;

import Classes.OptionsMenu;

public class TeamRemove extends Command{
    public TeamRemove() {
        super("team-remove");
    }

    @Override
    public void execute(String[] arguments) {
        assert arguments.length==2;
        arguments = arguments[1].split(";");
        int i = getTeamPosition(arguments[1]);
        int j = getPlayerPositionTeam(arguments[0], OptionsMenu.teams.get(i).getPlayersTeam());
        OptionsMenu.teams.get(i).getPlayersTeam().remove(j);

    }
}
