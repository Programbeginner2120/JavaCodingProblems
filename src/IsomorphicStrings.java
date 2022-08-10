// URL: https://leetcode.com/problems/isomorphic-strings/

import java.util.Map;
import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map <Character, Character> forward = new HashMap<>();
        Map <Character, Character> backward = new HashMap<>();
        Character sChar, tChar, forChar, backChar;
        for (int i = 0; i < s.length(); i++){
            sChar = s.charAt(i);
            tChar = t.charAt(i);
            forChar = forward.get(sChar);
            backChar = backward.get(tChar);
            if (forChar != tChar && backChar != sChar){
                if (forChar != null && forChar != tChar || backChar != null && backChar != sChar){
                    return false;
                }
                if (forChar == null){
                    forward.put(sChar, tChar);
                }
                if (backChar == null){
                    backward.put(tChar, sChar);
                }
            }
        }
        return true;
    }
}
