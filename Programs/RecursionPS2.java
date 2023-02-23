public class RecursionPS2 {
    public static void main(String[] args) {
        System.out.println(fib(3));
        
    }

    public static void mystery(int a) {
        if (a == 0)
            System.out.println("fin");
        else {
            System.out.println(a);
            mystery(a-1);
            System.out.println(a);
        }
    }
    //code prints every integer provided once in reverse order, then when a is 0 prints fin, then prints them numbers again in ascending order
    //I learnt that statements that come after the recursive call are executed in reverse, and that the recursive function won't stop until every statement has been executed
    public static int fib(int a) {
        if (a <= 2)
            return 1;
        else {
            return fib(a - 1) + fib(a-2);
        }
    }

    
}
