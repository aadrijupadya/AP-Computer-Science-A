public class RecursionPS4 {
    public static void main(String[] args) {
        System.out.println(bunnyEars(10));
        System.out.println(triangle(10));
        System.out.println(bunnyEars2(10));
    }
    
    public static int bunnyEars(int a) {
        if (a == 0) {
            return 0;
        }
        else {
            return 2 + bunnyEars(a-1);
        }
    }
    public static int bunnyEars2(int a) {
        if (a == 0) {
            return 0;
        }
        else if (a % 2 != 0) {
            return 2 + bunnyEars2(a-1);
        }
        else {
            return 3 + bunnyEars2(a-1);
        }
    }

    public static int triangle(int a) {
        if (a == 0) {
            return 0;
        }
        else {
            return (a) + triangle(a-1);
        }
    }
    public static void traverse(binaryTree bin) {
        if (bin == null) {
            return;
        }
        System.out.println(bin.getNum());
        if bin.getLeft() < bin.getRight() 
            traverse(bin.getLeft());
        else
            traverse(bin.getRight());
    } 


}
