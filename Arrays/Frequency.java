package Arrays;

public class Frequency {
    public static int frequency(int array[], int target) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1,2,2,3,4,2,5,2};
        System.out.println(frequency(array, 2));
    }
}
