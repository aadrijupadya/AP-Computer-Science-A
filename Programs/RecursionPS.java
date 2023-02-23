public class RecursionPS {
    public static void main(String[] args) {
        printStars(4);
        System.out.println(sumOfDigits(637));
        System.out.println(add(10,23));
        System.out.println(multiply(10,8));
        System.out.println(power(2,5));

    }

        
    public static void printStars(int a) {
        if (a == 0) 
            System.out.println();
        else {
            for (int i = 0; i < a; i++) {
                System.out.print("*");
            }
            System.out.println();
            printStars(a-1);
        }  
    }
    public static int sumOfDigits(int a) {
        if (a < 10)  {
            return a;
        }
        else {
            return (a % 10) + sumOfDigits(a/10);
        }
    }

    public static int add(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return add(a + 1, b - 1) ;
        }
    }

    public static int multiply(int a, int b) {
        if ( b == 0) {
            return 0;
        }
        else { 
            return add(a,multiply(a,b-1));
        }
    } 

    public static int power(int a, int b) {
        if ( b == 0) {
            return 1;
        }
        else { 
            return multiply(a, power(a,b-1));
        }
    } 

    
}
    


