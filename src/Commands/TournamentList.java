package Commands;

import Classes.*;
import Interfaces.Participant;
import Options.OptionsMenu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TournamentList extends Command {

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
                System.out.println("Participantes de " + tournament.getName() + ": (ordenados por " + tournament.getCategory()+")");

                List<Participant> aux = new ArrayList<>(tournament.getParticipants());
                Collections.sort(aux, new Comparator<Participant>() {
                    @Override
                    public int compare(Participant p1, Participant p2) {
                        switch (tournament.getCategory()){
                            case "winMatch":
                                return Double.compare(p2.getWinMatch(), p1.getWinMatch());
                            case "assistScore":
                                return Double.compare(p2.getAssistScore(), p1.getAssistScore());
                            case "tournamentsWin":
                                return Double.compare(p2.getTournamentsWin(), p1.getTournamentsWin());
                            case "moneyWin":
                                return Double.compare(p2.getMoneyWin(), p1.getMoneyWin());
                            default:
                                return Double.compare(p2.getScore(), p1.getScore());
                        }
                    }
                });

                for (Participant participant : aux) {
                    System.out.println(participant.getName() + " " + participant.getScore());
                }
            }
        }
    }
}
