package Strings;

class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char i : s.toCharArray()) {
            if(Character.isLetterOrDigit(i)){
                sb.append(Character.toLowerCase(i));
            }
        }
        // System.out.println(sb);
        int left = 0;
        int right = sb.length()-1;
        while(left<right) {
            if(sb.charAt(left)!=sb.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        ValidPalindrome obj = new ValidPalindrome();
        boolean result = obj.isPalindrome(s);
        System.out.println(result?"Valid Palindrome":"Not a Valid Palindrome");
    }
}
