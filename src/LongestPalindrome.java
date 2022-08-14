//URL: https://leetcode.com/problems/longest-palindrome/

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class LongestPalindrome {
    private Map<Character, Integer> populateLetterMap(String s){
        Map<Character, Integer> letterMap = new HashMap<>();
        for (char ch : s.toCharArray()){
            if (letterMap.get(ch) == null){
                letterMap.put(ch, 1);
            }
            else{
                letterMap.put(ch, letterMap.get(ch) + 1);
            }
        }
        return letterMap;
    }

    public int longestPalindrome(String s) {
        int length = 0;
        Map<Character, Integer> map = this.populateLetterMap(s);
        List<Character> keys = map.keySet().stream().collect(Collectors.toList());
        int freq;
        for (char ch : keys){
            freq = map.get(ch);
            if (freq % 2 == 0 || freq % 2 != 0 && length % 2 == 0){
                length += freq;
            }
            else{
                length += freq - 1;
            }
        }
        return length;
    }
}