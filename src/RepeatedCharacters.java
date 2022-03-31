// URL: https://www.hackerrank.com/challenges/repeated-string/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

import java.util.ArrayList;
public class RepeatedCharacters {

    public static long repeatedString(String s, long n) {
        long count = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                list.add(i);
        }

        long multFactor = n / s.length();
        long remainder = n % s.length();

        count += multFactor * list.size();
        for (int idx : list)
            count = idx < remainder ? count + 1 : count;

        return count;
    }
}
