package Strings;
class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' '); 
        return s.length() - lastSpaceIndex - 1;  
    }

    public static void main(String[] args) {
        LengthOfLastWord obj = new LengthOfLastWord();
        String s = "Karthik varma";
        System.out.println(obj.lengthOfLastWord(s));
    }
}
