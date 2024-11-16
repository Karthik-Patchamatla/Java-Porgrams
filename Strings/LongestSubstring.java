package Strings;

import java.util.*;

class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        Set<Character> hashset = new HashSet<>();
        for(int right=0;right<s.length();right++) {
            while(hashset.contains(s.charAt(right))) {
                hashset.remove(s.charAt(left));
                left++;
            }
            hashset.add(s.charAt(right));
            maxLength = Math.max(maxLength, (right-left)+ 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstring obj = new LongestSubstring();
        String s = "abcabcbb";
        System.out.println(obj.lengthOfLongestSubstring(s));
    }
}
