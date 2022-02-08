// url: https://leetcode.com/problems/single-number/submissions/

import java.util.*;
class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap <Integer, Integer> numMap = new HashMap();
        Integer resultOfSearch;
        for (int num : nums){
            resultOfSearch = numMap.get(num);
            if (resultOfSearch != null)
                numMap.remove(num);
            else
                numMap.put(num, num);
        }
        Collection <Integer> values = numMap.values();
        return values.iterator().next();
    }
}

// Could achieve constant extra space by using some inplace method?
