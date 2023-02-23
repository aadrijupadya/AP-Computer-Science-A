import java.util.*;

public class Room {
    private ArrayList<Room> area;
    private ArrayList<Item> stuff;
    private String description;

    public Room() {
        area = new ArrayList<>();
        stuff = new ArrayList<>();
        description = "Family Room";

    }

    public Room(String d) {
        area = new ArrayList<>();
        stuff = new ArrayList<>();
        description = d;

    }

    public void addRoom(Room r) {
        area.add(r);
    }

    public void addItem(Item i) {
        stuff.add(i);
    }

    public ArrayList<Room> getRooms() {
        return area;
    }

    public ArrayList<Item> getItems() {
        return stuff;
    }

    public String toString() {
        return description + "\nNumber of rooms: " + area.size() + " Number of items: " + stuff.size();
    }

}
