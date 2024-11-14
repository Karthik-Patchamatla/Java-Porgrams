import java.util.Scanner;

class PerfectNumber {
    public static boolean isPerfect(int a) {
        int sum = 0;
        if(a < 1) {
            return false;
        }

        for(int i=1;i<=a/2;i++) {
            if(a%i==0){
                sum+=i;
            }
        }
        return sum==a;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        boolean x = isPerfect(number);
        System.out.println(x?"Perfect Number":"Not a Perfect Number");
        obj.close();
    }
}