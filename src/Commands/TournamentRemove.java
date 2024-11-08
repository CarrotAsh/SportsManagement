package Commands;

import Options.OptionsMenu;
import Classes.Player;
import Classes.Team;
import Classes.Tournament;

public class TournamentRemove extends Command {
    public TournamentRemove() {
        super("tournament-remove");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Player;
        assert arguments.length==2;
        arguments = arguments[1].split(";");
        assert arguments.length==1 || arguments.length==1; // nameTournament / nameTournament;nameTeam
        int i = getPositionInList(arguments[1], OptionsMenu.teams);
        Team team= OptionsMenu.teams.get(i);
        int j = getPositionInList(arguments[0], OptionsMenu.tournaments);
        Tournament tournament= OptionsMenu.tournaments.get(j);

        Player player = (Player) OptionsMenu.loggedUser;
        if (arguments.length==1){
            int p = getPositionInList(player.getName(), tournament.getParticipants());
            tournament.getParticipants().remove(p);
            int t = getPositionInList(tournament.getName(),player.getTournamentsRegistered());
            player.getTournamentsRegistered().remove(t);
        }else{
            assert player.getTeam().equals(team.getName());
            int t = getPositionInList(team.getName(), tournament.getParticipants());
            tournament.getParticipants().remove(t);
            int r = getPositionInList(tournament.getName(),team.getTournamentsRegistered());
            team.getTournamentsRegistered().remove(r);
        }
        tournament.getMatchs().clear();
    }
}
