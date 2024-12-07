package Commands;

import Options.OptionsMenu;
import Classes.Player;

public class StatisticsShow extends Command{


    public StatisticsShow() {
        super("statistics-show");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.getLoggedUser() instanceof Player;
        assert arguments.length==2;
        Player player = (Player) OptionsMenu.getLoggedUser();
        if (arguments[1].equals("-csv")){
            System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", "Name", "Score", "WinMatch", "AssistScore", "TournamentsWin", "MoneyWin");
            System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", player.getName(), player.getPuntuation("score"), player.getPuntuation("winMatch"), player.getPuntuation("assistScore"), player.getPuntuation("tournamentsWin"), player.getPuntuation("moneyWin"));

        } else if (arguments[1].equals("-json")) {
            System.out.println(player);
        }else{
            System.out.println("Formato no válido");
        }

    }
}
