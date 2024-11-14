import java.util.Scanner;

public class ReverseNumber {
    public static void Reverse(int a) {
        int sum = 0;
        while(a>0){
            int r = a % 10;
            sum = sum*10 + r;
            a/=10;
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        Reverse(number);
        obj.close();
    }
}
