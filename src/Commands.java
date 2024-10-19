import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Commands {

    private static List<Matchmake> matchmakings = new ArrayList<>();

    public static void createPlayer(String name, List<Player> players){
        assert players.size() < 100;
        assert !playerExists(name, players);
        Player player = new Player(name);
        players.add(player);
    }

    public static void deletePlayer(String name, List<Player> players){
        int i=returnPlayerPosition(name, players);
        players.remove(i);
    }

    private static boolean playerExists(String name, List<Player> players){
        boolean exists = false;
        int i =0;
        while (!exists && i<players.size()){
            if (name.equalsIgnoreCase(players.get(i).getName())){
                exists = true;
            }
            i++;
        }
        return exists;
    }

    private static int returnPlayerPosition(String name, List<Player> players){
        assert playerExists(name, players);
        int i =0;
        int pos = 0;
        boolean found= false;
        while (!found && i<players.size()){
            if (name.equalsIgnoreCase(players.get(i).getName())){
                found = true;
                pos = i;
            }
            i++;
        }
        return pos;
    }

    public static void addScore(String name, double score, List<Player> players){
        assert playerExists(name, players);
        assert score>-999999;

        int i = returnPlayerPosition(name, players);
        players.get(i).setScore(score);
    }

    public static void showList(List<Player> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }

    public static void showRankList(List<Player> players){

        List<Player> aux = new ArrayList<>(players);
        Collections.sort(aux, new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                return Double.compare(p2.getScore(), p1.getScore());
            }
        });

        for (int i = 0; i < aux.size(); i++) {
            System.out.println(aux.get(i).getName() + " " + aux.get(i).getScore());
        }
    }

    public static void showMatchmake(){
        for (int i = 0; i < matchmakings.size(); i++) {
            System.out.println(matchmakings.get(i).toString());
        }
    }

    public static void clearMatchmake(){
        matchmakings.clear();
    }

    private static boolean playerWithMatch(Player player) {
        boolean withMatch = false;
        int i = 0;
        while (i < matchmakings.size() && !withMatch) {
            if (player.getName().equals(matchmakings.get(i).getPlayer1().getName()) || player.getName().equals(matchmakings.get(i).getPlayer2().getName())) {
                withMatch = true;
                i++;
            }
        }
        return withMatch;
    }

    public static void createMatchmake(String player1, String player2,List<Player> players){

        assert !player1.equals(player2);
        assert playerExists(player1, players) && playerExists(player2, players);
        Player playerLocal = getPlayerWithName(players, player1);
        Player playerVisitor = getPlayerWithName(players, player2);
        assert !playerWithMatch(playerLocal) && !playerWithMatch(playerVisitor);
        matchmakings.add(new Matchmake(playerLocal, playerVisitor));
    }

    public static void randomMatchmake(List<Player> players){
        assert players.size() % 2 == 0;
        matchmakings.clear();
        List<Integer> playersLeft = new ArrayList<>();
        for (int i = 0; i < players.size(); i++) {
            playersLeft.add(i);
        }
        Random random = new Random();
        int randNumber;
        for (int i = 0; i < players.size() / 2; i++) {
            randNumber = random.nextInt(playersLeft.size());
            int index = playersLeft.get(randNumber);
            playersLeft.remove(randNumber);
            randNumber = random.nextInt(playersLeft.size());
            int index2 = playersLeft.get(randNumber);
            playersLeft.remove(randNumber);
            matchmakings.add(new Matchmake(players.get(index), players.get(index2)));
        }
    }

    private static Player getPlayerWithName(List<Player> players, String name) {
        int i = 0;
        boolean found = false;
        Player player = null;
        while (i < players.size() && !found) {
            if (name.equalsIgnoreCase(players.get(i).getName())) {
                found = true;
                player = players.get(i);
            }
            i++;
        }
        return player;
    }
}
