import java.util.Scanner;

public class FactorialRecurssion {
    public static int factorial(int a) {
        if(a<=1){
            return 1;
        }
        return a*factorial(a-1);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        System.out.println(factorial(number));
        obj.close();
    }
}
