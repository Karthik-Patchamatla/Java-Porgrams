import java.util.Scanner;

public class Factorian {
    public static int factorial(int x) {
        if(x<=1){
            return 1;
        }
        return x * factorial(x-1);
    }

    public static boolean isFactorian(int a) {
        int temp = a;
        int sum = 0;
        while (temp>0) {
            int r = temp % 10;
            sum = sum + factorial(r);
            temp/=10;
        }
        return sum == a;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        boolean isTrue = isFactorian(number);
        System.out.println(isTrue?"Factorian":"Not a Factorian");
        obj.close();
    }
}
