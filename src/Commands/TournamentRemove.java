package Commands;

import Classes.OptionsMenu;
import Classes.Player;
import Classes.Tournament;

public class TournamentRemove extends Command{
    public TournamentRemove() {
        super("tournament-remove");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Player;
        assert arguments.length==2;
        arguments = arguments[1].split(";");
        assert arguments.length==1 || arguments.length==1; // nameTournament / nameTournament;nameTeam

        int i = getTournamentPosition(arguments[0]);
        Tournament tournament= OptionsMenu.tournaments.get(i);

        if (arguments.length==1){
            //assert el jugador está en el torneo
            //dar de baja
        }else{
            //assert pertenece a ese equipo
            //assert team pertenece ya a torneo
            //dar de baja
        }
        //Afecta a los emparejamientos
    }
}
