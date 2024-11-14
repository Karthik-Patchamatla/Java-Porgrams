import java.util.Scanner;

public class Functions {
    public static int Numbers(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int x = obj.nextInt();
            int y = obj.nextInt();
            int a = Numbers(x,y);
            System.out.println(a);
        }
    }
}
