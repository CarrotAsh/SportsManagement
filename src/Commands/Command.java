package Commands;

import Classes.OptionsMenu;
import Classes.Player;
import Classes.Team;
import Classes.Tournament;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public abstract class Command {
    private final String name;

    public Command(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    protected boolean playerExists(String name){
        int i =0;
        while (i< OptionsMenu.players.size()){
                if (name.equalsIgnoreCase(OptionsMenu.players.get(i).getName())){
                    return true;
                }
            i++;
        }
        return false;
    }

    protected boolean teamExists(String name){
        int i =0;
        while (i< OptionsMenu.teams.size()){
                if (name.equalsIgnoreCase(OptionsMenu.teams.get(i).getName())){
                    return true;
                }
            i++;
        }
        return false;
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

    protected int getTeamPosition(String name){
        assert teamExists(name);
        boolean found = false;
        int i = 0, pos = 0;
        while (!found && i < OptionsMenu.teams.size()) {
            if (name.equalsIgnoreCase(OptionsMenu.teams.get(i).getName())) {
                found = true;
                pos = i;
            }

            i++;
        }
        return pos;
    }

    protected boolean playerInTeam(String name, List<Player> players){
        int i =0;
        while (i< players.size()){
            if (name.equalsIgnoreCase(players.get(i).getName())){
                return true;
            }
            i++;
        }
        return false;
    }
    protected int getPlayerPositionInTeam(String name, List<Player> players){
        assert playerInTeam(name, players);
        boolean found = false;
        int i = 0, pos=0;
        while (!found && i<players.size()){
            if (name.equalsIgnoreCase(players.get(i).getName())){
                pos=i;
                found=true;
            }
        }
        return pos;
    }



    protected boolean tournamentExists(String name){
        int i =0;
        while (i< OptionsMenu.tournaments.size()){
            if (name.equalsIgnoreCase(OptionsMenu.tournaments.get(i).getName())){
                return true;
            }
            i++;
        }
        return false;
    }

    protected int getTournamentPosition(String name) {
        assert tournamentExists(name);
        boolean found = false;
        int i = 0, pos = 0;
        while (!found && i < OptionsMenu.tournaments.size()) {
            if (name.equalsIgnoreCase(OptionsMenu.tournaments.get(i).getName())) {
                found = true;
                pos = i;
            }

            i++;
        }
        return pos;
    }

    public abstract void execute(String[] arguments);
}
