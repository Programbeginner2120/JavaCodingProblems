//URL: https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

import java.util.*;
public class JumpingOnTheClouds {

    public static int jumpingOnClouds(ArrayList<Integer> c) {
        // Write your code here
        if (c.size() <= 1)
            return 0;

        Integer oneJump = null;
        Integer twoJump = null;

        if (c.size() - 1 > 0 && c.get(1) != 1)
            oneJump = 1 + jumpingOnClouds(new ArrayList<Integer>(c.subList(1, c.size())));
        if (c.size() - 2 > 0 && c.get(2) != 1)
            twoJump = 1 + jumpingOnClouds(new ArrayList<Integer>(c.subList(2, c.size())));

        if (oneJump == null)
            return twoJump;
        if (twoJump == null)
            return oneJump;
        return Math.min(oneJump, twoJump);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 1, 0));
        System.out.println(jumpingOnClouds(list));
    }
}