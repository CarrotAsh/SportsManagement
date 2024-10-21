package Commands;
import Classes.Administrator;
import Classes.OptionsMenu;
import Classes.Player;

public class PlayerCreate extends Command{

    public PlayerCreate() {
        super("player-create");
    }


    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Administrator;
        assert arguments.length==2;
        arguments = arguments[1].split(";");
        assert arguments.length==6; //implementar cuando sepamos
        assert !playerExists(arguments[2]);
        Player player = new Player(arguments[0],arguments[1],arguments[2], arguments[3],arguments[4],Double.parseDouble(arguments[5]), new Administrator("pepe", "uwu"));
        OptionsMenu.players.add(player);
    }
}
