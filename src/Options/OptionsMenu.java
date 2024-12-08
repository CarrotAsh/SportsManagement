package Options;

import Classes.*;
import Commands.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OptionsMenu {

    private static final List<Administrator> administrators = new ArrayList<>();
    private static final List<Player> players = new ArrayList<>();
    private static final List<Team> teams = new ArrayList<>();
    private static final List<Tournament> tournaments = new ArrayList<>();
    private static final List<Command> commands = new ArrayList<>();
    private static User loggedUser = null;

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        String completeLine;
        SettingsDefault.loadData();
        System.out.println("Bienvenido al sistema de Gestión Deportiva");
        do {
            System.out.println("Introduce un comando: ");
            completeLine = scanner.nextLine();
            String[] input = completeLine.split(" ");
            boolean correct = false;

            for (Command command : commands) {
                if (command.getName().equalsIgnoreCase(input[0])) {
                    command.execute(input);
                    correct = true;
                }
            }

            if (!correct && !input[0].equalsIgnoreCase("close")) {
                System.out.println("Comando incorrecto");
            }

        } while (!completeLine.equalsIgnoreCase("close"));
    }

    public static List<Administrator> getAdministrators() {
        return administrators;
    }

    public static List<Player> getPlayers() {
        return players;
    }

    public static List<Team> getTeams() {
        return teams;
    }

    public static List<Tournament> getTournaments() {
        return tournaments;
    }

    public static List<Command> getCommands() {
        return commands;
    }

    public static User getLoggedUser() {
        return loggedUser;
    }

    public static void setLoggedUser(User loggedUser) {
        OptionsMenu.loggedUser = loggedUser;
    }
}
