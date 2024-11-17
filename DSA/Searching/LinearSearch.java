package DSA.Searching;

public class LinearSearch {
    public static int Searching(int a[], int key) {
        for(int i=0; i<a.length; i++) {
            if(a[i]==key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {10,20,30,40};
        int key = 40;
        int value = Searching(array, key);
        System.out.println(String.format("The element %s is found at index %s", key,value));
    }
}
