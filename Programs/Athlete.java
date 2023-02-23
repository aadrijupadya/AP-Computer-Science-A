public class Athlete extends Person {
    public String sport;

    public Athlete() {
        super();
        sport = "Basketball";
    }

    public Athlete(int weight, Double height, String name, String sport) {
        super(weight, height, name);
        this.sport = sport;

    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String toString() {
        return "The sport of " + super.getName() + " is " + sport;
    }

    public Boolean BigAthlete() {
        if (super.getWeight() > 80 && sport.equals("Wrestling")) {
            return true;
        }
        return false;
    }

    public Boolean Large() {
        if (super.getHeight() > 2) {
            return true;

        }
        return false;
    }

    // accessing overwritten method
    public Boolean RegularLarge() {
        return super.Large();
    }

    public Boolean International() {
        if (American())
            return false;
        else
            return true;

    }

    private Boolean American() {
        if (sport.equals("Basketball") || sport.equals("Football") || sport.equals("Soccer")
                || sport.equals("Baseball")) {
            return true;
        }
        return false;

    }
}
