package Arrays;

public class ArrayElementFreq {
    // Java Program to find the frequency of each element in the array
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1, 5, 1, 7, 3, 3, 3};
        int[] visited = new int[array.length];

        for (int i = 0; i < visited.length; i++) {
            visited[i] = -1;
        }

        for (int i = 0; i < array.length; i++) {
            int count = 1;

            if (visited[i] == 1) {
                continue;
            }

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = 1;
                }
            }

            System.out.println("Element: " + array[i] + ", Frequency: " + count);
        }
    }
}
