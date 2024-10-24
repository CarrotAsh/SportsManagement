package Commands;

import Classes.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TournamentList extends Command{

    public TournamentList() {
        super("tournament-list");
    }

    @Override
    public void execute(String[] arguments) {
        assert arguments.length==1;
        if (OptionsMenu.loggedUser==null){
            for (int i = 0; i < OptionsMenu.tournaments.size(); i++) {
                Tournament tournament = OptionsMenu.tournaments.get(i);
                System.out.println("Participantes de " + tournament.getName() + ":");
                for (int j = 0; j < tournament.getParticipants().size(); j++) {
                    System.out.println(tournament.getParticipants().get(j).getName());
                }
            }
        }else {
            if (OptionsMenu.loggedUser instanceof Administrator){
                for (int i = OptionsMenu.tournaments.size()-1; i >=0 ; i--) {
                    if (OptionsMenu.tournaments.get(i).isFinish()){
                        OptionsMenu.tournaments.remove(i);
                    }
                }
            }
            for (int i = 0; i < OptionsMenu.tournaments.size(); i++) {
                Tournament tournament = OptionsMenu.tournaments.get(i);
                System.out.println("Participantes de " + tournament.getName() + ":");

                List<Participants> aux = new ArrayList<>(tournament.getParticipants());
                Collections.sort(aux, new Comparator<Participants>() { //ver por qué explota
                    @Override
                    public int compare(Participants p1, Participants p2) {
                        return Double.compare(p2.getScore(), p1.getScore());
                    }
                });

                for (int j = 0; j < aux.size(); j++) {
                    System.out.println(aux.get(j).getName() + " " + aux.get(j).getScore());
                }
            }

        }

    }
}
