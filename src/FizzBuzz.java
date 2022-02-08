// url: https://leetcode.com/problems/fizz-buzz/submissions/

import java.util.*;
class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        String [] retArray = new String [n];
        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 5 == 0)
                retArray[i-1] = "FizzBuzz";
            else if (i % 3 == 0)
                retArray[i-1] = "Fizz";
            else if (i % 5 == 0)
                retArray[i-1] = "Buzz";
            else
                retArray[i-1] = Integer.toString(i);
        }
        return Arrays.asList(retArray);
    }
}