import java.util.*;
public class derby {
        public static void main(String[] args) {
            Scanner pencil = new Scanner(System.in);
            int n = pencil.nextInt();
            pencil.nextLine();
            ArrayList<ArrayList<Integer>> racers = new ArrayList<ArrayList<Integer>>();
            //creating multidimensional arraylist to store car numbers
            for (int i = 0; i < n; i++) {
                String a = pencil.next();
                //storing string input 
                ArrayList<Integer> sub = new ArrayList<Integer>();
                for (int j = 0; j < 5; j++) {
                    int b = pencil.nextInt();
                    //taking in integer inputs
                    sub.add(b);
                }
                racers.add(sub);
                pencil.nextLine();
            }
            // System.out.println(racers);
            ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
            //creating multidimensional arraylist to store car numbers
            for (int i = 0; i < n; i++) {
                String a = pencil.next();
                ArrayList<Integer> sub = new ArrayList<Integer>();
                for (int j = 0; j < 5; j++) {
                    int b = pencil.nextInt();
                    //taking in integer inputs
                    sub.add(b);
                }
                results.add(sub);
                pencil.nextLine();
            }
            ArrayList<Integer> sums = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                //populating sums arraylist with zeros
                sums.add(0);
            }
            ArrayList<Integer> sorting = new ArrayList<Integer>();
            // System.out.println(results);
            for (int i = 0; i < racers.size(); i++) {
                ArrayList<Integer> sub = racers.get(i);
                for (int j = 0; j < sub.size(); j++) {
                    if (sorting.indexOf(sub.get(j)) == -1)  {
                        //if the car number doesn't currently exist in sorting, add it
                        sorting.add(sub.get(j));
                    } 
                    else {
                        ArrayList<Integer> sub2 = results.get(i);
                        //setting the sums nth element (element is equal to car number) by adding placement to sums
                        int g = sums.get(sub.get(j)-1);
                        sums.set(sub.get(j)-1, g + sub2.get(j));
                    }
                }
            }
           getResults(sums);
            
    }
        public static void getResults(ArrayList<Integer> sums) {
            ArrayList<Integer> finaltimes = new ArrayList<Integer>();
            System.out.print("First Place: " + (getIndexofMin(sums) + 1));
            finaltimes.add(sums.get(getIndexofMin(sums)));
            sums.set(getIndexofMin(sums), Integer.MAX_VALUE);
            //once we get the minimum value, replace it with a max to avoid duplicates
            while (sums.get(getIndexofMin(sums)) == finaltimes.get(0)) {
                // if there are ties, we add them by checking if they are equal to that place
                System.out.print(" " + (getIndexofMin(sums) + 1));
                sums.set(getIndexofMin(sums), Integer.MAX_VALUE);
            }
            System.out.println();
            System.out.print("Second Place: " + (getIndexofMin(sums) + 1));
            finaltimes.add(sums.get(getIndexofMin(sums)));
            sums.set(getIndexofMin(sums), Integer.MAX_VALUE);
            while (sums.get(getIndexofMin(sums)) == finaltimes.get(1)) {
                System.out.print(" " + (getIndexofMin(sums) + 1));
                sums.set(getIndexofMin(sums), Integer.MAX_VALUE);
            }
            System.out.println();
            System.out.print("Third Place: " + (getIndexofMin(sums) + 1));
            finaltimes.add(sums.get(getIndexofMin(sums)));
            sums.set(getIndexofMin(sums), Integer.MAX_VALUE);
            while (sums.get(getIndexofMin(sums)) == finaltimes.get(2)) {
                System.out.print(" " + (getIndexofMin(sums) + 1));
                sums.set(getIndexofMin(sums), Integer.MAX_VALUE);
            }
            System.out.println();
            System.out.print("Fourth Place: " + (getIndexofMin(sums) + 1));
            finaltimes.add(sums.get(getIndexofMin(sums)));
            sums.set(getIndexofMin(sums), Integer.MAX_VALUE);
            while (sums.get(getIndexofMin(sums)) == finaltimes.get(3)) {
                System.out.print(" " + (getIndexofMin(sums) + 1));
                sums.set(getIndexofMin(sums), Integer.MAX_VALUE);
            }
            System.out.println();
            System.out.print("Fifth Place: " + (getIndexofMin(sums) + 1));
            finaltimes.add(sums.get(getIndexofMin(sums)));
            sums.set(getIndexofMin(sums), Integer.MAX_VALUE);
            while (sums.get(getIndexofMin(sums)) == finaltimes.get(4)) {
                System.out.print(" " + (getIndexofMin(sums) + 1));
                sums.set(getIndexofMin(sums), Integer.MAX_VALUE);
            }
        }

        public static int getIndexofMin(ArrayList<Integer> data) {
            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int i = 0; i < data.size(); i++) {
                //traversing through arraylist to find smallest element
                if (data.get(i) < min) {
                    min = data.get(i);
                    //set index to smallest element
                    index = i;
                }
            }
            return index;
        }
}
