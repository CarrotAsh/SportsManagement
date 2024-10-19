package Commands;

import Classes.OptionsMenu;
import Classes.Player;

import java.util.List;

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
        while (!exists && i< OptionsMenu.players.size()){
                if (name.equalsIgnoreCase(OptionsMenu.players.get(i).getName())){
                    exists = true;
                }
            i++;
        }
        return exists;
    }

    protected int getPlayerPosition(String name) {
        assert playerExists(name);
        boolean found = false;
        int i = 0, pos = 0;
        while (!found && i < OptionsMenu.players.size()) {
                if (name.equalsIgnoreCase(OptionsMenu.players.get(i).getName())) {
                    found = true;
                    pos = i;
                }

            i++;
        }
        return pos;
    }

    public abstract void execute(String[] arguments);
}
