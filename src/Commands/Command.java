package Commands;

import Classes.OptionsMenu;
import Classes.Player;

public abstract class Command {
    private final String name;

    public Command(String name){
        this.name=name;
    }


    public String getName() {
        return name;
    }

    protected boolean playerExists(String name){
        boolean exists = false;
        int i =0;
        while (!exists && i< OptionsMenu.users.size()){
            Player player;
            if (OptionsMenu.users.get(i) instanceof Player){
                player=(Player) OptionsMenu.users.get(i);
                if (name.equalsIgnoreCase(player.getName())){
                    exists = true;
                }
            }
            i++;
        }
        return exists;
    }

    public abstract void execute(String[] arguments);
}
