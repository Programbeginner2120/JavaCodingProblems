// URL: https://leetcode.com/problems/valid-parentheses/

import java.util.Stack;
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack();

        for (Character ch : s.toCharArray()){
            if (ch.equals('(') || ch.equals('[') || ch.equals('{') || myStack.isEmpty())
                myStack.push(ch);
            else{
                String merged = Character.toString(myStack.peek()) + Character.toString(ch);
                if (merged.equals("{}") || merged.equals("()") || merged.equals("[]"))
                    myStack.pop();
                else
                    myStack.push(ch);
            }
        }

        return myStack.size() == 0;

    }

}
