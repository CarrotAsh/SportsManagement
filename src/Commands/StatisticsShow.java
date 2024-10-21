package Commands;

import Classes.Administrator;
import Classes.OptionsMenu;
import Classes.Player;

public class StatisticsShow extends Command{


    public StatisticsShow() {
        super("statistics-show");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Player;

    }
}
