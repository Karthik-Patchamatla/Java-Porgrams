import java.util.Scanner;

public class AutomorphicNumber {
    public static boolean isAutomorphic(int a) {
        int number = a*a;
        if(number%10 != a%10) {
            return false;
        } else {
            number = number/10;
            a = a/10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        boolean isTrue = isAutomorphic(x);
        System.out.println(isTrue?"Automorphic Number":"Not a Automorphic Number");
        obj.close();
    }
}
