package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static int[] Reverse(int a[]) {
        int left=0;
        int right=a.length-1;
        while(left<right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] =  temp;
            left++;
            right--;
        }
        return a;
    }

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(Reverse(array)));
    }
}