// URL: https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

import java.util.*;
public class SockMerchant {

    public static int sockMerchant(int n, List<Integer> ar) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int pairCount = 0;
        for (int sock : ar){
            if (map.get(sock) == null)
                map.put(sock, sock);
            else{
                map.remove(sock);
                pairCount++;
            }
        }
        return pairCount;
    }

}
