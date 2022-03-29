//URL: https://www.hackerrank.com/challenges/counting-valleys/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

import java.util.*;
public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        int valleys = 0;
        Stack <Character> stepStack = new Stack();
        for (int i = 0; i < steps; i++){
            if (!stepStack.isEmpty() && stepStack.peek() != path.charAt(i)){
                stepStack.pop();
            }

            else
                stepStack.push(path.charAt(i));
            valleys = stepStack.size() == 0 && path.charAt(i) == 'U' ? valleys + 1 : valleys;
        }
        return valleys;
    }

}
