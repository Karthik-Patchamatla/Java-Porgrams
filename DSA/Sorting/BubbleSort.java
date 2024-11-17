package DSA.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int array[]) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {7,8,2,1,3};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }
}
