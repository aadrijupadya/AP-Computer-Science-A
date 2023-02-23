public class sortStrings {
    public static void main(String[] args) {
        sort("phoenix");
    }
    public static void sort(String a) {
        char arr[] = new char[a.length()];

        for (int i = 0; i < a.length(); i++) {
            //storing String in an array of chars for ease of use
            arr[i] = a.charAt(i);
        }

        for (int i = 0; i < arr.length-1; i++) {
            // n - 1 to avoid out of bounds exception
            for (int j = 0; j < arr.length-i-1; j++) {
                //make sure to iterate over arr length - current iteration 
                if (arr[j] > arr[j + 1]) {
                    //swapping adjacent elements
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1]= temp;
                }       
            }
        }
        //converting array back to string
        String b = new String(arr);
        System.out.println(b);
    }       
}


