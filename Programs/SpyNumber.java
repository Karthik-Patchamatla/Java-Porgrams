import java.util.Scanner;

public class SpyNumber {
    public static boolean isSpy(int a) {
        int temp = a;
        int sum = 0;
        int product = 1;
        while(temp>0) {
            int r = temp%10;
            sum+=r;
            product*=r;
            temp/=10;
        }
        return sum==product;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        boolean x = isSpy(number);
        System.out.println(x?"Spy Number":"Not a Spy Number");
        obj.close();
    }
}
