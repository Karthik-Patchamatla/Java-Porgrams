package Arrays;

public class SmallestElement {
    // Java Program to print the largest element in an array
    public static int isSmallest(int a[]) {
        int smallest = a[0];
        for (int i = 0; i < a.length; i++) {
            if(smallest>a[i]) {
                smallest = a[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int array[] = {1,20,11,18,99};
        System.out.println(isSmallest(array));
    }
}
