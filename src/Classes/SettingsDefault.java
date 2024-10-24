package Classes;

import Commands.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SettingsDefault {
    public static void loadData(){

        OptionsMenu.administrators.add(new Administrator("admin@alumnos.upm.es", "1234"));
        OptionsMenu.administrators.add(new Administrator("admin2@alumnos.upm.es", "1111"));

        OptionsMenu.players.add(new Player("alvaro@alumnos.upm.es", "12345", "Alvaro", "Rojo", "10234765A", 12, 15, 4, 10, 1000, new Administrator("admin@alumnos.upm.es", "1234")));
        OptionsMenu.players.add(new Player("adrian@alumnos.upm.es", "12345", "Adrian", "Perez", "50234765B", 8, 12, 5, 5, 500, new Administrator("admin@alumnos.upm.es", "1234")));
        OptionsMenu.players.add(new Player("ines@alumnos.upm.es", "12345", "Ines", "Gomez", "30234765C", 10, 10, 2, 5, 570, new Administrator("admin@alumnos.upm.es", "1234")));
        OptionsMenu.players.add(new Player("fran@alumnos.upm.es", "12345", "Fran", "Vallejo", "70234765C", 9, 8, 1, 4, 450, new Administrator("admin@alumnos.upm.es", "1234")));
        OptionsMenu.players.add(new Player("javier@alumnos.upm.es", "12345", "Javier", "Gonzalez", "70234765C", 7, 5, 1, 4, 350, new Administrator("admin@alumnos.upm.es", "1234")));
        OptionsMenu.players.add(new Player("carlos@alumnos.upm.es", "12345", "Carlos", "Carvajal", "70234765C", 11, 9, 7, 3, 750, new Administrator("admin@alumnos.upm.es", "1234")));

        OptionsMenu.teams.add(new Team("IWSIM21", new Administrator("admin@alumnos.upm.es", "1234")));
        OptionsMenu.teams.add(new Team("IWSIM22", new Administrator("admin@alumnos.upm.es", "1234")));
        OptionsMenu.teams.add(new Team("CITIM21", new Administrator("admin@alumnos.upm.es", "1234")));
        OptionsMenu.teams.add(new Team("CITIT21", new Administrator("admin@alumnos.upm.es", "1234")));
        OptionsMenu.teams.get(0).getPlayersTeam().add(OptionsMenu.players.get(4));
        OptionsMenu.teams.get(0).getPlayersTeam().add(OptionsMenu.players.get(5));
        OptionsMenu.teams.get(3).getPlayersTeam().add(OptionsMenu.players.get(0));
        OptionsMenu.teams.get(3).getPlayersTeam().add(OptionsMenu.players.get(1));

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Tournament tournamentF = new Tournament("Torneo Futbol", LocalDate.parse("22/12/2024", format), LocalDate.parse("24/12/2024", format), "Liga Mayor", "Futbol");
        tournamentF.getParticipants().add(OptionsMenu.players.get(0));
        tournamentF.getParticipants().add(OptionsMenu.players.get(1));
        tournamentF.getParticipants().add(OptionsMenu.players.get(2));
        tournamentF.getParticipants().add(OptionsMenu.players.get(3));
        Tournament tournamentB = new Tournament("Torneo Baloncesto", LocalDate.parse("28/12/2024", format), LocalDate.parse("30/12/2024", format), "Liga Menor", "Baloncesto");
        tournamentB.getParticipants().add(OptionsMenu.players.get(2));
        tournamentB.getParticipants().add(OptionsMenu.players.get(3));
        tournamentB.getParticipants().add(OptionsMenu.teams.get(0));
        tournamentB.getParticipants().add(OptionsMenu.teams.get(3));
        OptionsMenu.tournaments.add(tournamentF);
        OptionsMenu.tournaments.add(tournamentB);

        OptionsMenu.commands.add(new Login());
        OptionsMenu.commands.add(new Logout());
        OptionsMenu.commands.add(new PlayerCreate());
        OptionsMenu.commands.add(new PlayerDelete());
        OptionsMenu.commands.add(new TeamCreate());
        OptionsMenu.commands.add(new TeamDelete());
        OptionsMenu.commands.add(new TeamAdd());
        OptionsMenu.commands.add(new TeamRemove());
        OptionsMenu.commands.add(new TournamentCreate());
        OptionsMenu.commands.add(new TournamentDelete());
        OptionsMenu.commands.add(new TournamentMatchmaking());
        OptionsMenu.commands.add(new TournamentAdd());
        OptionsMenu.commands.add(new TournamentRemove());
        OptionsMenu.commands.add(new StatisticsShow());
        OptionsMenu.commands.add(new TournamentList());
    }
}
