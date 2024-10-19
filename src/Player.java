public class Player {
    private String name;
    private double score;

    public Player(String name) {
        this.name = name;
        score = 0.0;
    }

    public Player(String name, double score) {
        this.name = name;
        this.score = score;
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
