public class Computer extends AbstractEntity {
    //attributes 
    private String brand;
    private int memory;
    private boolean touchScreen;

    //constructors

    public Computer() {
        brand = "Apple";
        memory = 64;
        touchScreen = false;
    }

    public Computer(String brand, int memory, boolean touchScreen) {
        this.brand = brand;
        this.memory = memory;
        this.touchScreen = touchScreen;
    }
    //Getters and setters

    public String getBrand() {
        return brand;
    }
    public int getMemory() {
        return memory;
    }
    public boolean getTouchScreen() {
        return touchScreen;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
    public void setTouchScreen(Boolean touchScreen) {
        this.touchScreen = touchScreen;
    }
    // Methods
    public String toString() {
        return "This is a computer of type " + brand + ", with " + memory + " GB of memory "; 
    }

    public void multiply(int a, int b) {
        System.out.println(a * b);
    } 

    public void storeDevice(AbstractEntity e) {
        super.getEntities().add(e); 
    }





   
}
