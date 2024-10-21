package Classes;

import Commands.*;

public class SettingsDefault {
    public static void loadData(){

        OptionsMenu.administrators.add(new Administrator("admin@alumnos.upm.es", "1234"));
        OptionsMenu.administrators.add(new Administrator("admin2@alumnos.upm.es", "1111"));

        //OptionsMenu.players.add(new Player()); Agregar los player por defecto

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
