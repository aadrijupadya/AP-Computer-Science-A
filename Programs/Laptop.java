public class Laptop extends Computer {
    private String software;

    public Laptop() {
        super();
        software = "Mac OS";
    }

    public Laptop(String brand, int memory, Boolean touchScreen, String software) {
        super(brand, memory, touchScreen);
        this.software = software;
    }

    public String getSoftware() {
        return software;
    } 

    public void setSoftware(String software) {
        this.software = software;
    }

    public String toString() {
        return super.toString() + " has software " + software;
    }

    


   

    
}
