package Strings;

class FirstOccuranceIndex {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        FirstOccuranceIndex obj = new FirstOccuranceIndex();
        System.out.println(obj.strStr(haystack, needle)); 
    }
}