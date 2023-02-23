public class LearningFile {
    public static void main(String[] args) {
        Shoe x = new Heel(8, "blue", 3);
        x.method1();
        Footwear z = new Shoe();
        Footwear y = new Heel();


        Shoe[] box = new Shoe[3]; //legal
        box[0] = x;
        box[1] = new Shoe();
    
        //can't initialize this way 
        //Heel to a shoe heel
        Heel a = new Heel();
        Shoe b = a;
        //shoe/heel to a heel
        Shoe c = new Heel();
        Heel d = (Heel) c;
    }
}