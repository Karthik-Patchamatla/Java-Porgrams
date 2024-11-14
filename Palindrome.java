import java.util.*;

public class Palindrome {
    public static boolean isPalindrome(int a) {
        int temp = a;
        int sum = 0;
        while(temp>0) {
            int r = temp % 10;
            sum = sum*10 + r;
            temp = temp / 10;
        }
        return sum == a;
    }

    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int x = obj.nextInt();
            boolean y = isPalindrome(x);
            System.out.println(y ? "Palindrome": "Not a Palindrome");
        }
    }
}
