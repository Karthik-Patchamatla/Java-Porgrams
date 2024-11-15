package Arrays;

import java.util.Arrays;

public class ArrayCopy {
    // Java Program to copy all elements of one array into another array
    public static int[] Copy(int a[]) {
        int arrayCopy[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            arrayCopy[i] = a[i];
        }
        return a;
    }

    public static void main(String[] args) {
        int arrayInput[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(Copy(arrayInput)));
    }
}
