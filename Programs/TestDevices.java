
public class TestDevices {
    public static void main(String[] args) {
        Computer c = new Computer();
        Smartphone s = new Smartphone();
        System.out.println(c);
        System.out.println(s);
        c.storeDevice((AbstractEntity) c);
        System.out.println(s.getId());
        System.out.println(c.getEntities());
    }
    
    
}
