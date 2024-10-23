package Commands;

import Classes.OptionsMenu;
import Classes.Player;
import Classes.Team;
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
        int i = getTeamPosition(arguments[1]);
        Team team= OptionsMenu.teams.get(i);
        int j = getTournamentPosition(arguments[0]);
        Tournament tournament= OptionsMenu.tournaments.get(j);

        Player player = (Player) OptionsMenu.loggedUser;
        if (arguments.length==1){
            int p = getPlayerPositionInTornament(player.getName(), tournament.getParticipatingPlayers());
            tournament.getParticipatingPlayers().remove(p);
            int t = getTournamentPositionInTournamentsOfPlayer(tournament.getName(),player.getTournamentsRegistered());
            player.getTournamentsRegistered().remove(t);
        }else{
            assert player.getTeam().equals(team.getName());
            int t = getTeamPositionInTornament(team.getName(), tournament.getParticipatingTeams());
            tournament.getParticipatingTeams().remove(t);
            int r = getTournamentPositionInTournamentsOfTeam(tournament.getName(),team.getTournamentsRegistered());
            player.getTournamentsRegistered().remove(r);
        }
        //Afecta a los emparejamientos en ambos casos
    }
}
