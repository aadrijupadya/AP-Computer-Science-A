import java.util.Scanner;

public class Mowing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num_lawns = input.nextInt();
        input.nextLine();
       for (int i = 0; i < num_lawns; i++) {
           int length = input.nextInt();
           int width = input.nextInt();
           int start_x = input.nextInt();
           int start_y = input.nextInt();
           input.nextLine();
           String[][] lawn = new String[length][width];
           for (int a = 0; a < length; a++) {
               for (int b = 0; b < width; b++) {
                   lawn[a][b] = input.next();
               }
               input.nextLine();
           }
           for (String[] strings : lawn) {

               for (String s : strings) {
                   System.out.print(s + " ");
               }
               System.out.println();
           }
          traverse(lawn,start_x,start_y,i);
              
       }

       input.close();
    }

    //traverse function to check dots nearby
    public static void traverse(String[][] lawn, int x, int y, int r) {
        if (lawn[x+1][y+1].equals(".")) {
            //use recursion to traverse all possible coordinates
            if (check(lawn,x,y,r)) {
                traverse(lawn,x-1,y-1,r);
            }
            lawn[x][y] = "C";
            lawn[x][y+1] = "C";
            lawn[x][y-1] = "C";

            lawn[x+1][y] = "C";
            lawn[x+1][y+1] = "C";
            lawn[x+1][y-1] = "C";

            lawn[x-1][y+1] = "C";
            lawn[x-1][y] = "C";
            lawn[x-1][y+1] = "C";

 
        }
        else {
            lawn[x][y] = ".";
        }
        

    }
    //checking function to check for trees and boundaries 
    public static Boolean check(String[][] lawn, int x, int y, int r) {
        if (lawn[x][y].equals("T")) {
            return false;
        }
        //boundary conditions
        if (r + x < 0 || r + x >= r) {
            return false;
        }

        return true;
    }

}
