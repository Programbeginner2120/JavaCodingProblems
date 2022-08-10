// URL: https://leetcode.com/problems/is-subsequence/

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int sPtr = 0;
        int tPtr = 0;
        int lengthS = s.length();
        int lengthT = t.length();
        StringBuilder sb = new StringBuilder();
        while (sPtr < lengthS && tPtr < lengthT){
            if (s.charAt(sPtr) == t.charAt(tPtr)){
                sb.append(s.charAt(sPtr));
                sPtr++;
            }
            tPtr++;
        }
        return sb.toString().equals(s);
    }
}