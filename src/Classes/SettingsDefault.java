package Classes;

import Commands.Login;
import Commands.Logout;
import Commands.PlayerCreate;
import Commands.PlayerDelete;

public class SettingsDefault {
    public static void loadData(){

        OptionsMenu.administrators.add(new Administrator("Admin", "1234"));
        OptionsMenu.administrators.add(new Administrator("Admin2", "1111"));

        //OptionsMenu.players.add(new Player()); Agregar los player por defecto

        OptionsMenu.commands.add(new Login());
        OptionsMenu.commands.add(new Logout());
        OptionsMenu.commands.add(new PlayerCreate());
        OptionsMenu.commands.add(new PlayerDelete());
    }
}
