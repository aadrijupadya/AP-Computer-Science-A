public abstract class Sports implements Activity {
    private String sport;
    private int numFans;

    public Sports() {
        sport = "Soccer";
        numFans = 3500000;
    }

    public Sports(String sport, int numFans) {
        this.sport = sport;
        this.numFans = numFans;
    }

    public String getSport() {
        return sport;
    }

    public int getFans() {
        return numFans;
    }
    
    public void setSport(String sport) {
        this.sport = sport;
    }

    public void setFans(int numFans) {
        this.numFans = numFans;
    }

    public void burnCalories(int minutes) {
        System.out.println("You burned " + (minutes * 10) + " calories");
    }

    public Boolean largeSport() {
        if ( numFans > 1000000) {
            return true;
        }
        return false;
    }

   
    

    
}
