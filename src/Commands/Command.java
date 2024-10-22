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

    protected int getTeamPosition(String name){
        //assert TeamExists
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

    protected int getPlayerPositionInTeam(String name, List<Player> players){
        //assert jugador pertenece a Team
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
        boolean exists = false;
        int i =0;
        while (!exists && i< OptionsMenu.tournaments.size()){
            if (name.equalsIgnoreCase(OptionsMenu.tournaments.get(i).getName())){
                exists = true;
            }
            i++;
        }
        return exists;
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
