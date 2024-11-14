import java.util.Scanner;

public class AutobiographicalNumber {
    public static boolean isAutographic(int a) {
        int length = String.valueOf(a).length();
        int temp = a;
        int sum = 0;
        while(temp>0) {
            int r = temp%10;
            sum = sum + r;
            temp = temp/10;
        }
        return sum == length;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        boolean x = isAutographic(number);
        System.out.println(x?"Autographic Number":"Not a Autographic Number");
        obj.close();
    }
}
