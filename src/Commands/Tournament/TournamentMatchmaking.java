package Commands.Tournament;

import Classes.*;
import Commands.Command;
import Interfaces.Participant;
import Options.OptionsMenu;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TournamentMatchmaking extends Command {
    public TournamentMatchmaking() {
        super("tournament-matchmaking");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Administrator;
        assert arguments.length==2; // -m/-a;nameTournament
        arguments=arguments[1].split(";");
        assert arguments.length==2;
        Tournament tournament = OptionsMenu.tournaments.get(getPositionInList(arguments[1], OptionsMenu.tournaments));
        assert tournament.inProgress() && tournament.getParticipants().size()%2==0;

        if (arguments[0].equals("-m")){
            System.out.println("Participantes del torneo:");
            for (int i = 0; i < tournament.getParticipants().size(); i++) {
                System.out.println(tournament.getParticipants().get(i).getName());
            }
            int c=0;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Introduce emparejamiento: ");
                String line = scanner.nextLine();
                String[] arg = line.split(";");
                assert arg.length==2 && !playerWithMatchInTournament(arg[0], tournament.getMatchs()) && !playerWithMatchInTournament(arg[0], tournament.getMatchs());
                Matchmake match = new Matchmake();
                match.addParticipant(tournament.getParticipants().get(getPositionInList(arg[0], tournament.getParticipants())) , 0);
                match.addParticipant(tournament.getParticipants().get(getPositionInList(arg[1], tournament.getParticipants())), 1);
                tournament.getMatchs().add(match);
                c++;
            } while (c<tournament.getParticipants().size()/2);

        } else if (arguments[0].equals("-a")) {
            List<Participant> aux = tournament.getParticipants();
            Collections.shuffle(aux);

            for (int i = 0; i < aux.size(); i += 2) {
                Matchmake match = new Matchmake();
                match.addParticipant(aux.get(i), 0);
                match.addParticipant(aux.get(i + 1), 1);
                tournament.getMatchs().add(match);
            }
        }
        else{
            System.out.println("Argumento de emparejamiento invalido");
        }

    }
}
