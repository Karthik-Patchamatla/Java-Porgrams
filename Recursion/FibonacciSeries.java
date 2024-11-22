package Recursion;

public class FibonacciSeries {
    public static void fibonacci(int a, int b, int n) {
        if(n==0) {
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        fibonacci(b, c, n-1);
    }

    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;
        int n = 10;
        System.out.print(f1+" ");
        System.out.print(f2+" ");
        fibonacci(f1, f2, n-2);
    }
}
