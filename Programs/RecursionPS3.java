public class RecursionPS3 {
    public static void main(String[] args) {
        
        // System.out.println(GCF(360,50));
        doubleMountain(3);
        // System.out.print(dectoBin(75));
    }
    public static int GCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            return GCF(b, a % b);
        }
    }

    public static void doubleMountain(int a) { 
        if (a!=1) {
            printStars(a);
            doubleMountain(a-1);
        }
    }
    
    public static int dectoBin(int a) {
        if (a < 2) {
            return a;
        }
        return (a % 2 + 10 * dectoBin(a/2));
        //multiplying by 10 each iteration, taking mod for remainder, dividing by 2
    }
    public static void printStars(int a) {
        if (a != 0) {
            for (int i = 0; i < a; i++) {
                System.out.print("*");
            }
            System.out.println();
            printStars(a-1);
        }  
    }

}

    
