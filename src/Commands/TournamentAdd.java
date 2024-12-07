package Commands;

import Classes.*;
import Options.OptionsMenu;

public class TournamentAdd extends Command {
    public TournamentAdd() {
        super("tournament-add");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.getLoggedUser() instanceof Player;
        assert arguments.length==2;
        arguments = arguments[1].split(";");
        assert arguments.length==1 || arguments.length==2; // nameTournament / nameTournament;nameTeam
        int i = getPositionInList(arguments[0], OptionsMenu.getTournaments());
        Tournament tournament= OptionsMenu.getTournaments().get(i);
        assert !tournament.inProgress();

        Player player = (Player) OptionsMenu.getLoggedUser();
        if (arguments.length==1){
            assert !existInList(player.getName(), tournament.getParticipants());
            tournament.getParticipants().add(player);
            player.getTournamentsRegistered().add(tournament);
        }else{
            int j = getPositionInList(arguments[1], OptionsMenu.getTeams());
            Team team= OptionsMenu.getTeams().get(j);
            assert player.getTeam().equals(team.getName()) && !existInList(team.getName(), tournament.getParticipants());
            tournament.getParticipants().add(team);
            team.getTournamentsRegistered().add(tournament);
        }
    }
}
