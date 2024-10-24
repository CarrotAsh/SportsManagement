package Classes;

import Commands.*;

public class SettingsDefault {
    public static void loadData(){

        OptionsMenu.administrators.add(new Administrator("admin@alumnos.upm.es", "1234"));
        OptionsMenu.administrators.add(new Administrator("admin2@alumnos.upm.es", "1111"));

        OptionsMenu.players.add(new Player("alvaro@alumnos.upm.es", "12345", "Alvaro", "Rojo", "10234765A", 12, 15, 4, 10, 1000, new Administrator("admin@alumnos.upm.es", "1234")));
        OptionsMenu.players.add(new Player("adrian@alumnos.upm.es", "12345", "Adrian", "Perez", "50234765B", 8, 12, 5, 5, 500, new Administrator("admin@alumnos.upm.es", "1234")));
        OptionsMenu.players.add(new Player("ines@alumnos.upm.es", "12345", "Ines", "Gomez", "30234765C", 10, 10, 2, 5, 570, new Administrator("admin@alumnos.upm.es", "1234")));
        OptionsMenu.players.add(new Player("fran@alumnos.upm.es", "12345", "Fran", "Vallejo", "70234765C", 9, 8, 1, 4, 450, new Administrator("admin@alumnos.upm.es", "1234")));

        OptionsMenu.teams.add(new Team("IWSIM21", new Administrator("admin@alumnos.upm.es", "1234")));
        OptionsMenu.teams.add(new Team("IWSIM22", new Administrator("admin@alumnos.upm.es", "1234")));
        OptionsMenu.teams.add(new Team("CITIM21", new Administrator("admin@alumnos.upm.es", "1234")));
        OptionsMenu.teams.add(new Team("CITIT21", new Administrator("admin@alumnos.upm.es", "1234")));

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
    }
}
