package Arrays;

import java.util.Arrays;

public class Sort {
    // Java Program to sort the elements of an array in ascending order using Bubble Sort
    public static int[] Sorting(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int array[] = {20, 10, 40, 25, 30};
        System.out.println(Arrays.toString(Sorting(array)));
    }
}
