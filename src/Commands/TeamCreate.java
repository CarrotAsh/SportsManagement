package Commands;
import Classes.Administrator;
import Options.OptionsMenu;
import Classes.Team;

public class TeamCreate extends Command{

    public TeamCreate() {
        super("team-create");
    }


    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Administrator;
        assert arguments.length==2 && !existInList(arguments[1], OptionsMenu.teams);
        Team team = new Team(arguments[1], new Administrator(OptionsMenu.loggedUser.getUserName(),OptionsMenu.loggedUser.getPassword()));
        OptionsMenu.teams.add(team);
    }
}
