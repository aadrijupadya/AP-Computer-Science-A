
public class house {
    public static void main(String[] args) {
        Room House = new Room("House");

        // Bedroom and Closet
        Room Bedroom = new Room("Bedroom");
        Item bed = new Item("bed");
        Item poster = new Item("poster");
        Room Closet = new Room("closet");
        Item clothes = new Item("clothes");
        Closet.addItem(clothes);
        Bedroom.addRoom(Closet);
        Bedroom.addItem(bed);
        Bedroom.addItem(poster);
        House.addRoom(Bedroom);

        // Bathroom
        Room Bathroom = new Room("Bathroom");
        Item sink = new Item("sink");
        Item mirror = new Item("mirror");
        Item toilet = new Item("toilet");
        Bathroom.addItem(sink);
        Bathroom.addItem(mirror);
        Bathroom.addItem(toilet);
        House.addRoom(Bathroom);

        // Living Room
        Room Living = new Room("Living Room");
        Item tv = new Item("TV");
        Item sofa = new Item("Sofa");
        Living.addItem(tv);
        Living.addItem(sofa);
        House.addRoom(Living);

        // Rec Room
        Room Rec = new Room("Rec Room");
        Item Foosball = new Item("Foosball Table");
        Item ice = new Item("Ice Cream Machine");
        Rec.addItem(ice);
        Rec.addItem(Foosball);
        House.addRoom(Rec);

        // Garage
        Room Garage = new Room("Garage");
        Item ferrari = new Item("Ferrari");
        Item bike = new Item("Bike");
        Item Tesla = new Item("Tesla");
        Garage.addItem(ferrari);
        Garage.addItem(bike);
        Garage.addItem(Tesla);
        House.addRoom(Garage);

        System.out.println(House.toString());

        // displaying info for each house
        for (int i = 0; i < House.getRooms().size(); i++) {
            System.out.println(House.getRooms().get(i).toString());

        }

    }

}
