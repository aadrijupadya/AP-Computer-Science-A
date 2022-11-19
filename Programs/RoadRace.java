import java.util.*;

public class RoadRace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of racers");
        int datasize = input.nextInt();
        input.nextLine();
        ArrayList<racer> racers = new ArrayList<racer>();
        for (int i = 0; i < datasize; i++) {
            System.out.println("Entire time");
            int time = input.nextInt();
            input.nextLine();
            System.out.println("Enter gender");
            String gender = input.nextLine();
            racer a = new racer(gender, time);
            racers.add(a);
        }
        Display(racers);
        Sort(racers);
        Winners(racers);
        input.close();

    }

    public static void Display(ArrayList<racer> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).toString());
        }
    }

    public static ArrayList<racer> Sort(ArrayList<racer> a) {
        boolean swapped = true;
        // bubble sort algorithm
        while (swapped) {
            swapped = false;
            for (int i = 0; i < a.size() - 1; i++) {
                if (a.get(i).getTime() > a.get(i + 1).getTime()) {
                    racer temp = a.get(i);
                    a.set(i, a.get(i + 1));
                    a.set(i + 1, temp);
                    swapped = true;
                }
            }
        }
        return a;
    }

    public static void Winners(ArrayList<racer> a) {
        int time0 = a.get(0).getTime();
        int time1 = 0;
        // String gender0 = a.get(0).getGender();
        ArrayList<racer> males = new ArrayList<racer>();
        ArrayList<racer> females = new ArrayList<racer>();

        for (int i = 1; i < a.size(); i++) {
            if (a.get(i).getGender().equals("F")) {
                females.add(a.get(i));
            } else {
                males.add(a.get(i));
            }
        }
        if (females.get(0).getTime() <= males.get(0).getTime()) {
            time1 = females.get(0).getTime();
            females.remove(0);

        } else {
            time1 = males.get(0).getTime();
            males.remove(0);
        }
        System.out.println("First place time " + time0);
        System.out.println("Second place time " + time1);
        System.out.println("First place female " + females.get(0).getTime());
        System.out.println("First place female " + females.get(1).getTime());
        System.out.println("First place male " + males.get(0).getTime());
        System.out.println("Second place male " + males.get(1).getTime());

    }

}
