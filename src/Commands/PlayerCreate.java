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
        assert arguments.length==10; // userName;password;name;surname;DNI;score;winMatch;assistScore;tournamentsWin;moneyWin
        assert !playerExists(arguments[2]);

        try {
            Double score = Double.parseDouble(arguments[5]);
            Double winMatch = Double.parseDouble(arguments[6]);
            Double assistScore = Double.parseDouble(arguments[7]);
            Double tournamentsWin = Double.parseDouble(arguments[8]);
            Double moneyWin = Double.parseDouble(arguments[9]);

            Player player = new Player(arguments[0],arguments[1],arguments[2], arguments[3],arguments[4],score,winMatch,assistScore,tournamentsWin,moneyWin, new Administrator(OptionsMenu.loggedUser.getUserName(),OptionsMenu.loggedUser.getPassword()));
            OptionsMenu.players.add(player);
        }catch (Exception e){
            System.out.println("Error: Algún dato no es correcto");
        }

    }
}
