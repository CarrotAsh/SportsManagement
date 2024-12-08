package Commands;

import Classes.*;
import Interfaces.Nameable;

import java.util.List;

public abstract class Command {
    private final String name;

    public Command(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected <T extends Nameable> boolean existInList(String name, List<T> list) {
        int i = 0;
        while (i < list.size()) {
            if (name.equals(list.get(i).getName())) {
                return true;
            }
            i++;
        }
        return false;
    }

    protected <T extends Nameable> int getPositionInList(String name, List<T> list) {
        assert existInList(name, list);
        boolean found = false;
        int i = 0, pos = 0;
        while (!found && i < list.size()) {
            if (name.equalsIgnoreCase(list.get(i).getName())) {
                found = true;
                pos = i;
            }
            i++;
        }
        return pos;
    }

    protected boolean withoutMatchInTournament(String name, List<Matchmake> list) {
        if (!list.isEmpty()) {
            for (Matchmake matchmake : list) {
                if (name.equals(matchmake.getMatch()[0].getName()) || name.equals(matchmake.getMatch()[1].getName())) {
                    return false;
                }
            }
        }
        return true;
    }

    public abstract void execute(String[] arguments);
}
