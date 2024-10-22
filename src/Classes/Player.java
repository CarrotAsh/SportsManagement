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

    public Player(String userName, String password, String name, String surname, String DNI, double score, double winMatch, double assistScore, double tournamentsWin, double moneyWin, Administrator creatorUser) {
        super(userName, password);
        this.name = name;
        this.surname = surname;
        this.DNI = DNI;
        this.score = score;
        this.winMatch=winMatch;
        this.assistScore=assistScore;
        this.tournamentsWin=tournamentsWin;
        this.moneyWin=moneyWin;
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
