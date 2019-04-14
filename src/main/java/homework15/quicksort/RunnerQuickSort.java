package homework15.quicksort;

public class RunnerQuickSort {

    final static int SIZE = 10000;
    final static int[] ARR1 = randomInitArray(SIZE);
    final static int[] ARR2 = randomInitArray(SIZE);

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int size= SIZE;
        int[] arr = ARR1;
        // System.out.println(Arrays.toString(a));
        long timeStart = System.currentTimeMillis();
        quickSort.sort(arr);
        int[] results = arr;
        long timeEnd=System.currentTimeMillis();

        System.out.println("It took "+
                            (timeEnd-timeStart)+" ms to sort (via Quicksort) array of "+size+" elements.");
        // System.out.println(Arrays.toString(results));

        //added a comment to experiment with github
        QuickSort2 quickSort2 = new QuickSort2();
        int size2= SIZE;
        int[] arr2 = ARR2;
        long timeStart2 = System.currentTimeMillis();
        quickSort2.sort(arr2, 0, arr2.length-1);
        int[] results2 = arr2;
        long timeEnd2=System.currentTimeMillis();

        System.out.println("It took "+(timeEnd2-timeStart2)+
                            " ms to sort (via Quicksort2) array of "+size2+" elements.");
        // System.out.println(Arrays.toString(results2));
    }

    private static int[] randomInitArray(int size) {
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1); // числа от 1 до 100
        }
        return arr;
    }
}
