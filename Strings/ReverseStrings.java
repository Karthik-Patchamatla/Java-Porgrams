package Strings;

import java.util.Arrays;

public class ReverseStrings {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left<right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        char[] charArray = {'h','e','l','l','o'};
        ReverseStrings obj = new ReverseStrings();
        obj.reverseString(charArray);
    }
}
