import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int a) {
        if(a<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(a);i++) {
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int number = obj.nextInt();
            boolean y = isPrime(number);
            System.out.println(y?"Prime Number":"Not a Prime Number");
        }
        
    }
}
