// url: https://leetcode.com/problems/valid-palindrome/submissions/

class ValidPalindrome {
    // private static String reverseString(String str){
    //     if (str.isEmpty())
    //         return "";
    //     return str.charAt(str.length() - 1) + reverseString(str.substring(0,str.length()-1));
    // }

    private static String reverseString(String str){
        String retString = "";
        for (int i = str.length() - 1; i >= 0; i--)
            retString += str.charAt(i);
        return retString;
    }

    public boolean isPalindrome(String s) { git status
        String characterString = "";
        for (int i = 0; i < s.length(); i++){
            if (Character.isLetterOrDigit(s.charAt(i)))
                characterString += s.charAt(i);
        }
        characterString = characterString.toLowerCase();
        int midIndex = characterString.length() / 2;
        String frontOfString = characterString.substring(0, midIndex);
        String backOfString;
        if (characterString.length() % 2 != 0)
            backOfString = characterString.substring(midIndex + 1);
        else
            backOfString = characterString.substring(midIndex);
        backOfString = ValidPalindrome.reverseString(backOfString);
        if (frontOfString.equals(backOfString))
            return true;
        return false;
    }
}