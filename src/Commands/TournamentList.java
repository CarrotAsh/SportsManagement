package Commands;

import Classes.Administrator;
import Classes.OptionsMenu;
import Classes.Player;

public class TournamentList extends Command{

    public TournamentList() {
        super("tournament-list");
    }

    @Override
    public void execute(String[] arguments) {
        assert arguments.length==1;
        if (OptionsMenu.loggedUser==null){
        //mostrar sin ranking

        }else {
            if (OptionsMenu.loggedUser instanceof Administrator){
                //borrar finalizados
            }
            //mostrar con ranking
        }

    }
}
