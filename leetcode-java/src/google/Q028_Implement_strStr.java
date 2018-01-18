package google;

public class Q028_Implement_strStr {

    public int strStr(String haystack, String needle) {
        int i = 0, j = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                i = i-j+1;
                j = 0;
            }
        }
        if (j == needle.length()) return i-j;
        else return -1;
    }

}
