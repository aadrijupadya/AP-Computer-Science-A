public class Person {
    // attributes
    private int weight;
    private Double height;
    private String name;

    // default constructor
    public Person() {
        weight = 60;
        height = 1.5;
        name = "John";
    }

    // custom constructor
    public Person(int weight, Double height, String name) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    // custom custom constructor

    public Person(int weight) {
        Person p = new Person();
        this.weight = weight;
        this.height = p.getHeight();
        this.name = p.getName();

    }

    // getters
    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Double getHeight() {
        return height;
    }

    // setters
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    // custom methods

    public static Double BMI(Double weight, int height) {
        return (weight / Math.pow((height), 2));
    }

    public static String BMI(Double weight, int height, String name) {
        return name + "BMI is  " + (weight / Math.pow((height), 2));
    }

    public Boolean Large() {
        if (height > 1.8) {
            return true;

        }
        return false;
    }

    public String toString() {
        return "Person: " + name + ",Weight: " + weight + ",Height: " + height;

    }

}
