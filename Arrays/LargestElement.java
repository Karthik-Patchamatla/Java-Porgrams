package Arrays;

public class LargestElement {
    // Java Program to print the largest element in an array
    public static int isLargest(int a[]) {
        int largest = a[0];
        for (int i = 0; i < a.length; i++) {
            if(largest<a[i]) {
                largest = a[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int array[] = {1,20,11,18,99};
        System.out.println(isLargest(array));
    }
}
