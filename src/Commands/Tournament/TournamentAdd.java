package Commands.Tournament;

import Classes.*;
import Commands.Command;
import Options.OptionsMenu;

public class TournamentAdd extends Command {
    public TournamentAdd() {
        super("tournament-add");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Player;
        assert arguments.length==2;
        arguments = arguments[1].split(";");
        assert arguments.length==1 || arguments.length==2; // nameTournament / nameTournament;nameTeam
        int i = getPositionInList(arguments[0], OptionsMenu.tournaments);
        Tournament tournament= OptionsMenu.tournaments.get(i);
        assert !tournament.inProgress();

        Player player = (Player) OptionsMenu.loggedUser;
        if (arguments.length==1){
            assert !existInList(player.getName(), tournament.getParticipants());
            tournament.getParticipants().add(player);
            player.getTournamentsRegistered().add(tournament);
        }else{
            int j = getPositionInList(arguments[1], OptionsMenu.teams);
            Team team= OptionsMenu.teams.get(j);
            assert player.getTeam().equals(team.getName()) && !existInList(team.getName(), tournament.getParticipants());
            tournament.getParticipants().add(team);
            team.getTournamentsRegistered().add(tournament);
        }
    }
}
