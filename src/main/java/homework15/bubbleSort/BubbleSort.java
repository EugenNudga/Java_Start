package homework15.bubbleSort;

import java.util.Arrays;

public final class BubbleSort {

    //если у тебя такая сигнатура, это обозначает, что нужно делать
    // копию массива и его сортировать, при этом не меняя текущий.
    // если ты хочешь поменять текущий, не стоит ни чего возращать(void)
    public static int[] bubbleSort(int[] a) {
       // int temp[] = Arrays.copyOf(a, a.length);// make copy of array a
        // в цикле внизу сложность такого алгоритма O(N), хотелось бы O(1)
        //если размер массива N, нужно сделать N операций для копирования.
        //А можно ли все сразу скопировать.
        //System.arraycopy()  or Arrays.copy()
        int temp[]=new int[a.length];
        //вроде как не влияет на скорость, проверь для больших массивов сам, потом.
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        for (int i = 0; i < temp.length; i++) {
            //вложеный цикл
            for (int j = 0; j < temp.length - 1 - i; j++) {
                swap(temp, j);
            }
        }
        return temp;
    }

    private static void swap(int[] temp, int j) {
        if (temp[j] > temp[j + 1]) {
            int tempElement = temp[j + 1];
            temp[j + 1] = temp[j];
            temp[j] = tempElement;
        }
    }

}
