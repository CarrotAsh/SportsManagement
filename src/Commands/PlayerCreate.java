package Commands;
import Classes.Administrator;
import Options.OptionsMenu;
import Classes.Player;

public class PlayerCreate extends Command {

    public PlayerCreate() {
        super("player-create");
    }


    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.getLoggedUser() instanceof Administrator;
        assert arguments.length==2;
        arguments = arguments[1].split(";"); // userName;password;name;score;winMatch;assistScore;tournamentsWin;moneyWin
        assert arguments.length==8 &&  !existInList(arguments[2], OptionsMenu.getPlayers());

        try {

            Player player = new Player(arguments[0],arguments[1],arguments[2],Double.parseDouble(arguments[3]), Double.parseDouble(arguments[4]), Double.parseDouble(arguments[5]), Double.parseDouble(arguments[6]), Double.parseDouble(arguments[7]));
            OptionsMenu.getPlayers().add(player);

        }catch (Exception e){
            System.out.println("Error: Algún dato no es correcto");
        }

    }
}
