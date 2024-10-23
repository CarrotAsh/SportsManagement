package Commands;

import Classes.*;

public class TournamentAdd extends Command{
    public TournamentAdd() {
        super("tournament-add");
    }

    @Override
    public void execute(String[] arguments) {
        assert OptionsMenu.loggedUser instanceof Player;
        assert arguments.length==2;
        arguments = arguments[1].split(";");
        assert arguments.length==1 || arguments.length==2; // nameTournament / nameTournament;nameTeam
        int i = getTournamentPosition(arguments[0]);
        Tournament tournament= OptionsMenu.tournaments.get(i);
        assert !tournament.inProgress();

        Player player = (Player) OptionsMenu.loggedUser;
        if (arguments.length==1){
            assert !playerInTournament(player.getName(), tournament.getParticipatingPlayers());
            tournament.getParticipatingPlayers().add(player);
            player.getTournamentsRegistered().add(tournament);
        }else{
            int j = getTeamPosition(arguments[1]);
            Team team= OptionsMenu.teams.get(j);
            assert player.getTeam().equals(team.getName());
            assert !teamInTournament(team.getName(), tournament.getParticipatingTeams());
            tournament.getParticipatingTeams().add(team);
            team.getTournamentsRegistered().add(tournament);

        }

    }
}
