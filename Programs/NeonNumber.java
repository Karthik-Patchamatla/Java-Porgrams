import java.util.Scanner;

public class NeonNumber {
    public static boolean isNeon(int a) {
        int number = a*a;
        int temp = number;
        int sum = 0;
        while(temp>0) {
            int r = temp%10;
            sum = sum + r;
            temp = temp/10;
        }
        return a==sum;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        boolean x = isNeon(number);
        System.out.println(x?"Neon Number":"Not a Neon Number");
        obj.close();
    }
}
