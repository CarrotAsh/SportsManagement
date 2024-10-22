package Commands;

import Classes.Administrator;
import Classes.OptionsMenu;
import Classes.Player;
import Classes.Tournament;

public class TournamentAdd extends Command{
    public TournamentAdd() {
        super("tournament-add");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Player;
        assert arguments.length==2;
        arguments = arguments[1].split(";");
        assert arguments.length==1 || arguments.length==1; // nameTournament / nameTournament;nameTeam

        int i = getTournamentPosition(arguments[0]);
        Tournament tournament= OptionsMenu.tournaments.get(i);
        assert !tournament.inProgress();

        if (arguments.length==1){
            //solo jugador
            //assert jugador no está ya
        }else{
            //solo team
            //assert pertenece a ese equipo
            //assert team no pertenece ya a torneo

        }

    }
}
