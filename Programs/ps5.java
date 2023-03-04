public class ps5 {
    public static void main(String[] args) {
        int[] a = {5,6,2};
        System.out.println(possibleSum(0, a, 20));
        System.out.println(possibleSum6(0, a, 20));
        System.out.println(possibleSum6(0, a, 9));

        
    }

    public static boolean possibleSum(int start, int[] a, int sum) {
        if (start >= a.length)
            return (sum == 0);
            // if our index is greater than the array length (out of bounds), we check if sum is equal to 0 or not
        if (possibleSum(start+1, a, sum - a[start])) {
            // accounting for first number
            return true;
        }
        if (possibleSum(start+1, a, sum)) {
            //checking if current set of numbers is equal to sum
            return true;
        }
        return false;
    }

    public static boolean possibleSum6(int start, int[] a, int sum) {
        if (start >= a.length)
            return (sum == 0);
            // if our index is greater than the array length (out of bounds), we check if sum is equal to 0 or not
        if (possibleSum6(start+1, a, sum - a[start])) {
            // accounting for first number
            return true;
        }

        if (a[start] == 6) {
            return possibleSum6(start+1, a, sum - 6);
            //if we find a 6, rerun the recursion but from the start
        }
        

        if (possibleSum6(start+1, a, sum)) {
            //checking if current set of numbers is equal to sum
            return true;
        }
        return false;
    }
}

