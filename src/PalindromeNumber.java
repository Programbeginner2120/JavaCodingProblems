//URL: https://leetcode.com/problems/palindrome-number/

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
            String xAsStr = Integer.toString(x);
            StringBuilder sb = new StringBuilder(xAsStr);
            sb.reverse();
            return sb.toString().equals(xAsStr);
    }
}
