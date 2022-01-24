//URL: https://leetcode.com/problems/detect-capital/

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        boolean firstIsCaps = false;
        boolean allCaps = false;
        for (int i = 0; i < word.length(); i++){
            char current = word.charAt(i);
            if (i == 0 && Character.isUpperCase(current)){
                firstIsCaps = true;
            }
            else if (firstIsCaps){
                if (!Character.isUpperCase(current)){
                    if (allCaps)
                        return false;
                }
                else{
                    if (Character.isUpperCase(current) && !allCaps && i == 1)
                        allCaps = true;
                    if (!allCaps)
                        return false;
                }
            }
            else if (!firstIsCaps && Character.isUpperCase(current))
                return false;
        }
        return true;
    }
}

// The key to this question and subsequent solution is to use a loop which then looks at each character and determines,
// based on booleans, whether it is valid
