public class Smartphone extends Computer {
    private String dataplan;

    public Smartphone() {
        super();
        dataplan = "T-Mobile";
    }

    public Smartphone(String brand, int memory, Boolean touchScreen, String dataplan)  {
        super(brand, memory, touchScreen);
        this.dataplan = dataplan;
    }

    public String getDataplan() { 
        return dataplan;
    }

    public void setDataplan(String dataplan) { 
        this.dataplan = dataplan;
    }

    public String toString() {
        return super.toString() + "(Also a Smartphone with " + dataplan + " as its dataplan"; 
    }


    
}
