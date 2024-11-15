package Arrays;

public class ElementsSum {
    // Java Program to print the sum of all the items of the array
    public static int Sum(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Sum(array));
    }
}
