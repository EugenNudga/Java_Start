package homework15.bubbleSort;

public class RunnerBubbleSort {
    public static void main(String[] args) {
        int size=10000;
        int[] arr = randomInitArray(size);
        // System.out.println(Arrays.toString(a));
        long timeStart = System.currentTimeMillis();
        int[] results = BubbleSort.bubbleSort(arr);
        long timeEnd=System.currentTimeMillis();

        System.out.println("It took "+(timeEnd-timeStart)+" ms to sort array of "+size+" elements.");
        // System.out.println(Arrays.toString(results));
    }

    private static int[] randomInitArray(int size) {
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1); // числа от 1 до 100
        }
        return arr;
    }
}
