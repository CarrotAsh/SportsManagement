package Options;

import Classes.*;
import Commands.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OptionsMenu {

    public static List<Administrator> administrators = new ArrayList<>();
    public static List<Player> players = new ArrayList<>();
    public static List<Team> teams = new ArrayList<>();
    public static List<Tournament> tournaments = new ArrayList<>();
    public static List<Command> commands = new ArrayList<>();
    public static User loggedUser = null;

    public static void start(){
        Scanner scanner = new Scanner(System.in);
        String completeLine;
        SettingsDefault.loadData();
        System.out.println("Bienvenido al sistema de Gestión Deportiva");
        do{
            System.out.println("Introduce un comando: ");
            completeLine = scanner.nextLine();
            String[] input = completeLine.split(" ");
            boolean correct=false;

            for(Command command : commands){
                if (command.getName().equalsIgnoreCase(input[0])){
                    command.execute(input);
                    correct=true;
                }
            }

            if (!correct && !input[0].equalsIgnoreCase("close")){
                System.out.println("Comando incorrecto");
            }

        }while (!completeLine.equalsIgnoreCase("close"));
    }
}
