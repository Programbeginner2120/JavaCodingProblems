// URL: https://leetcode.com/problems/richest-customer-wealth/

// import java.util.stream.*;
public class RichestCustomerWealth {

    private static int sum(int [] arr){
        int total = 0;
        for (int elem : arr)
            total += elem;
        return total;
    }

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int current;
        for (int[] holder : accounts) {
            current = RichestCustomerWealth.sum(holder);
            max = max < current ? current : max;
        }
        return max;
    }


//     public int maximumWealth(int[][] accounts) {  // This solution to the problem utilizes streams
//         int max = 0;
//         int currentSum;
//         List <Integer> currentHolder;
//         for (int [] holder : accounts){
//             currentHolder = IntStream.of(holder).boxed().collect(Collectors.toList());
//             currentSum = currentHolder.stream().reduce(0, Integer::sum);
//             max = max < currentSum ? currentSum : max;
//         }
//         return max;
//     }

}
