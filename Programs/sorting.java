public class sorting {
    public static void main(String[] args) {
        int[] a = {5,6,3,2,0,8,9};
        // selectionSort(a);
        insertionSort(a);
        printNums(a);
    }

    public static int[] insertionSort(int[] a) {
        for (int i = 1; i < a.length - 1; i++) {
            int j = i;
            while ((j > 0) && (a[j-1] > a[j])) {
                swap(a, j, j-1);
                j--;
            }     
        }
        return a;
    }

    public static int[] selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int index = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[index]){
                    index = j;
                    //if another element is smaller than current pointer, change index
                }
            }
            swap(a,index,i);
        }
        return a;
    }


    public static void swap (int[] arr, int b, int c) {
        int d = arr[b];
        arr[b] = arr[c];
        arr[c] = d;
    }

    public static void printNums(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}

