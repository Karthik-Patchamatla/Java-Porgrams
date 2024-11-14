import java.util.Scanner;

public class Armstrong {
    public static boolean isArmstrong(int a) {
        int temp = a;
        int sum = 0;
        int length = String.valueOf(a).length();
        while(temp>0) {
            int r = (int)Math.pow((temp%10), length);
            sum = sum + r;
            temp = temp / 10;
        }
        return sum==a;
    }

    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int x = obj.nextInt();
            boolean y = isArmstrong(x);
            System.out.println(y ? "Armstrong Number" : "Not a Armstrong Number");
        }
    }
}
