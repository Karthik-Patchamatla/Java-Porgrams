package DSA;

import java.util.Arrays;

public class BinarySearch {
    public static int Searching(int a[], int left, int right, int key) {

        if(left>right) {
            return -1;
        }

        int mid = left + ((right-left)/2);
        if(a[mid]==key) {
            return mid;
        }

        if(a[mid]>key) {
            return Searching(a, 0, mid-1, key);
        } else {
            return Searching(a, mid+1, right, key);
        }
    }

    public static void main(String[] args) {
        int[] array = {20,10,40,23,32};
        Arrays.sort(array);
        int key = 10;
        int value = Searching(array, 0, array.length-1, key);
        System.out.println(String.format("The element %s found in the %s index",key,value));
    }
}
