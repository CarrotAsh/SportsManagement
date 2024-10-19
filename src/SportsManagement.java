import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SportsManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Player> players = new ArrayList<>();
        players.add(new Player("Luisa", 4.5));
        players.add(new Player("Manuel", 2.7));
        players.add(new Player("Kurt", 4.0));
        players.add(new Player("Sofia", 3.8));
        players.add(new Player("Robert", 3.8));
        String p, p2;

        do{

            System.out.println("Introduce una opción:");
            System.out.println("> create [player]");
            System.out.println("> remove [player]");
            System.out.println("> show");
            System.out.println("> rank");
            System.out.println("> score [player];[score]");
            System.out.println("> show_matchmake");
            System.out.println("> clear_matchmake");
            System.out.println("> matchmake [player1];[player2]");
            System.out.println("> random_matchmake");
            System.out.println("> close");
            p = scanner.next();

            switch (p){
                case "create":
                    p2 = scanner.next();
                    Commands.createPlayer(p2 , players);
                    break;
                case "remove":
                    p2 = scanner.next();
                    Commands.deletePlayer(p2, players);
                    break;
                case "show":
                    Commands.showList(players);
                    break;
                case "rank":
                    Commands.showRankList(players);
                    break;
                case "score":
                    p2 = scanner.next();
                    String p3[] = p2.split(";");
                    double score =  Double.parseDouble(p3[1]);
                    Commands.addScore(p3[0], score, players);
                    break;
                case "show_matchmake":
                    Commands.showMatchmake();
                    break;
                case "clear_matchmake":
                    Commands.clearMatchmake();
                    break;
                case "matchmake":
                    p2 = scanner.next();
                    String[] pl = p2.split(";");
                    Commands.createMatchmake(pl[0],  pl[1], players);
                    break;
                case "random_matchmake":
                    Commands.randomMatchmake(players);
                    break;
                case "close":
                    System.out.println("Cerrando aplicación");
                    break;
                default:
                    System.out.println("Comando incorrecto");
                    break;
            }

        } while(!p.equals("close"));
    }
}