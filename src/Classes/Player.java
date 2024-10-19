package Classes;

public class Player extends User{
    private final String name;
    private final String surname;
    private final String DNI;
    private double score;
    private double winMatch;
    private double assistScore;
    private double tournamentsWin;
    private double moneyWin;
    private final Administrator creatorUser;

    public Player(String userName, String password, String name, String surname, String DNI, double score,  Administrator creatorUser) {
        super(userName, password); //ver como creamos finalmente el player
        this.name = name;
        this.DNI = DNI;
        this.score = score;
        this.surname = surname;
        this.creatorUser=creatorUser;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
