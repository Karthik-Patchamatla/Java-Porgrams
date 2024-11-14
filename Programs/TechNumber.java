import java.util.Scanner;

public class TechNumber {
    public static boolean isTech(int a) {
        int temp = a;
        int number = String.valueOf(a).length();
        int divisor = (int)Math.pow(10, number/2);
        int x = a%divisor;
        int y = a/divisor;
        int z = (int)Math.pow(x+y, 2);
        return temp == z;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        boolean isTrue = isTech(number);
        System.out.println(isTrue?"Tech Number":"Not a Tech Number");
        obj.close();
    }
}
