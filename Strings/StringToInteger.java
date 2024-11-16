package Strings;

class StringToInteger {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        int sign = 1;
        int i = 0;
        long result = 0;

        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            i++;
        }
        return (int) (result * sign);
    }

    public static void main(String[] args) {
        StringToInteger obj = new StringToInteger();
        String s = "-123";
        System.out.println(obj.myAtoi(s));
    }
}

