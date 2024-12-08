package Commands;

import Classes.*;
import Interfaces.Participant;
import Options.OptionsMenu;

import java.util.ArrayList;
import java.util.List;

public class TournamentList extends Command {

    public TournamentList() {
        super("tournament-list");
    }

    @Override
    public void execute(String[] arguments) {
        assert arguments.length==1;

        if (OptionsMenu.getLoggedUser()==null){
            for (int i = 0; i < OptionsMenu.getTournaments().size(); i++) {
                Tournament tournament = OptionsMenu.getTournaments().get(i);
                System.out.println("Participantes de " + tournament.getName() + ":");
                for (int j = 0; j < tournament.getParticipants().size(); j++) {
                    System.out.println(tournament.getParticipants().get(j).getName());
                }
            }
        }else {
            if (OptionsMenu.getLoggedUser() instanceof Administrator){
                for (int i = OptionsMenu.getTournaments().size()-1; i >=0 ; i--) {
                    if (OptionsMenu.getTournaments().get(i).isFinish()){
                        OptionsMenu.getTournaments().remove(i);
                    }
                }
            }
            for (int i = 0; i < OptionsMenu.getTournaments().size(); i++) {
                Tournament tournament = OptionsMenu.getTournaments().get(i);
                System.out.println("Participantes de " + tournament.getName() + ": (ordenados por " + tournament.getCategory()+")");

                List<Participant> aux = new ArrayList<>(tournament.getParticipants());
                aux.sort((p1, p2) -> Double.compare(p2.getPuntuation(tournament.getCategory()), p1.getPuntuation(tournament.getCategory())));

                for (Participant participant : aux) {
                    System.out.println(participant.getName() + " " + participant.getPuntuation(tournament.getCategory()));
                }
            }
        }
    }
}
