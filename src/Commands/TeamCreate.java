package Commands;
import Classes.Administrator;
import Classes.OptionsMenu;
import Classes.Player;
import Classes.Team;

public class TeamCreate extends Command{

    public TeamCreate() {
        super("team-create");
    }


    @Override
    public void execute(String[] arguments) {
        arguments = arguments[1].split(";");
        Team team = new Team;
        OptionsMenu.team.add(arguments[i]);
    }
}
