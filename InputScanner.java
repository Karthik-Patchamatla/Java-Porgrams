import java.util.*;

public class InputScanner {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int a = obj.nextInt();
            System.out.println(a);
        }
    }
}
