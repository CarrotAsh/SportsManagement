package Options;

import Classes.*;
import Commands.*;
import Commands.PlayerCreate;
import Commands.PlayerDelete;
import Commands.TeamAdd;
import Commands.TeamCreate;
import Commands.TeamDelete;
import Commands.TeamRemove;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SettingsDefault {
    public static void loadData(){

        OptionsMenu.getAdministrators().add(new Administrator("admin@alumnos.upm.es", "1234"));
        OptionsMenu.getAdministrators().add(new Administrator("admin2@alumnos.upm.es", "1111"));

        OptionsMenu.getPlayers().add(new Player("alvaro@alumnos.upm.es", "12345", "Alvaro", "Rojo",  "23409234S", 12, 15, 4, 10, 1000));
        OptionsMenu.getPlayers().add(new Player("adrian@alumnos.upm.es", "12345", "Adrian", "Perez",  "73657378G",8, 12, 5, 5, 500));
        OptionsMenu.getPlayers().add(new Player("ines@alumnos.upm.es", "12345", "Ines", "Gomez",  "98567183W", 10, 10, 2, 5, 570));
        OptionsMenu.getPlayers().add(new Player("fran@alumnos.upm.es", "12345", "Fran", "Gonzalez",  "78234109A", 9, 8, 1, 4, 450));
        OptionsMenu.getPlayers().add(new Player("javier@alumnos.upm.es", "12345", "Javier", "Carvajal",  "67157835L", 7, 5, 1, 4, 350));
        OptionsMenu.getPlayers().add(new Player("carlos@alumnos.upm.es", "12345", "Carlos", "Fernandez",  "20987157V", 11, 9, 7, 3, 750));

        OptionsMenu.getTeams().add(new Team("IWSIM21"));
        OptionsMenu.getTeams().add(new Team("IWSIM22"));
        OptionsMenu.getTeams().add(new Team("CITIM21"));
        OptionsMenu.getTeams().add(new Team("CITIT21"));
        OptionsMenu.getTeams().get(0).getPlayersTeam().add(OptionsMenu.getPlayers().get(4));
        OptionsMenu.getTeams().get(0).getPlayersTeam().add(OptionsMenu.getPlayers().get(5));
        OptionsMenu.getTeams().get(3).getPlayersTeam().add(OptionsMenu.getPlayers().get(0));
        OptionsMenu.getTeams().get(3).getPlayersTeam().add(OptionsMenu.getPlayers().get(1));

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Tournament tournamentF = new Tournament("TorneoFutbol", LocalDate.parse("22/12/2024", format), LocalDate.parse("24/12/2024", format), "Liga 1", "Futbol", "score");
        tournamentF.getParticipants().add(OptionsMenu.getPlayers().get(0));
        tournamentF.getParticipants().add(OptionsMenu.getPlayers().get(1));
        tournamentF.getParticipants().add(OptionsMenu.getPlayers().get(2));
        tournamentF.getParticipants().add(OptionsMenu.getPlayers().get(3));
        Tournament tournamentB = new Tournament("TorneoBaloncesto", LocalDate.parse("28/12/2024", format), LocalDate.parse("30/12/2024", format), "Liga 3", "Baloncesto", "winMatch");
        tournamentB.getParticipants().add(OptionsMenu.getPlayers().get(2));
        tournamentB.getParticipants().add(OptionsMenu.getPlayers().get(3));
        tournamentB.getParticipants().add(OptionsMenu.getTeams().get(0));
        tournamentB.getParticipants().add(OptionsMenu.getTeams().get(3));
        OptionsMenu.getTournaments().add(tournamentF);
        OptionsMenu.getTournaments().add(tournamentB);

        OptionsMenu.getCommands().add(new Login());
        OptionsMenu.getCommands().add(new Logout());
        OptionsMenu.getCommands().add(new PlayerCreate());
        OptionsMenu.getCommands().add(new PlayerDelete());
        OptionsMenu.getCommands().add(new TeamCreate());
        OptionsMenu.getCommands().add(new TeamDelete());
        OptionsMenu.getCommands().add(new TeamAdd());
        OptionsMenu.getCommands().add(new TeamRemove());
        OptionsMenu.getCommands().add(new TournamentCreate());
        OptionsMenu.getCommands().add(new TournamentDelete());
        OptionsMenu.getCommands().add(new TournamentMatchmaking());
        OptionsMenu.getCommands().add(new TournamentAdd());
        OptionsMenu.getCommands().add(new TournamentRemove());
        OptionsMenu.getCommands().add(new StatisticsShow());
        OptionsMenu.getCommands().add(new TournamentList());
    }
}
