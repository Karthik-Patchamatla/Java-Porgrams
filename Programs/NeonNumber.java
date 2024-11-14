import java.util.Scanner;

public class NeonNumber {
    public static boolean isNeon(int a) {
        int number = a*a;
        int sum = 0;
        while(a>0) {
            int r = a%10;
            sum = sum + r;
            a = a/10;
        }
        return number==sum;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        boolean x = isNeon(number);
        System.out.println(x?"Neon Number":"Not a Neon Number");
        obj.close();
    }
}
