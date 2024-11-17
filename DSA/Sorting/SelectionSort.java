package DSA.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int array[]) {
        for (int i = 0; i < array.length-1; i++) {
            int current = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[current]) {
                    current = j;
                }
            }
            int temp = array[current];
            array[current] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {7,8,3,1,2};
        System.out.println(Arrays.toString(selectionSort(array)));
    }
}
