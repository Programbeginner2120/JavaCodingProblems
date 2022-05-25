import java.util.ArrayList;

class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        for (int num : nums){
            if (num % 2 == 0){
                evens.add(num);
            }
            else{
                odds.add(num);
            }
        }
        evens.addAll(odds);
        return evens.stream().mapToInt(i -> i).toArray();
    }
}