//URL: https://leetcode.com/problems/backspace-string-compare/

import java.util.Stack;

class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> sSubStack = new Stack<>();
        Stack <Character> tSubStack = new Stack<>();
        int i = 0;
        while (i < s.length() || i < t.length()){
            if (i < s.length()){
                if (s.charAt(i) == '#' && !sSubStack.isEmpty()){
                    sSubStack.pop();
                }
                else if (s.charAt(i) != '#') {
                    sSubStack.push(s.charAt(i));
                }
            }
            if (i < t.length()){
                if (t.charAt(i) == '#' && !tSubStack.isEmpty()){
                    tSubStack.pop();
                }
                else if (t.charAt(i) != '#') {
                    tSubStack.push(t.charAt(i));
                }
            }
            i++;
        }
        return sSubStack.equals(tSubStack);
    }
}