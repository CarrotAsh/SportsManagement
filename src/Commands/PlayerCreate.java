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
        assert OptionsMenu.loggedUser instanceof Administrator;
        assert arguments.length==2;
        arguments = arguments[1].split(";"); // userName;password;name;surname;DNI;score;winMatch;assistScore;tournamentsWin;moneyWin
        assert arguments.length==10 &&  !existInList(arguments[2], OptionsMenu.players);

        try {

            Player player = new Player(arguments[0],arguments[1],arguments[2], arguments[3],arguments[4],Double.parseDouble(arguments[5]), Double.parseDouble(arguments[6]), Double.parseDouble(arguments[7]), Double.parseDouble(arguments[8]), Double.parseDouble(arguments[9]));
            OptionsMenu.players.add(player);

        }catch (Exception e){
            System.out.println("Error: Algún dato no es correcto");
        }

    }
}
