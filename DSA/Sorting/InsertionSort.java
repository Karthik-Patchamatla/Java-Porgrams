package DSA.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {7,8,3,1,2};
        System.out.println(Arrays.toString(insertionSort(array)));
    }
}
