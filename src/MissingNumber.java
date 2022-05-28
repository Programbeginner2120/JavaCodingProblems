import java.util.HashMap;
class MissingNumber {
    public int missingNumber(int[] nums) {
        HashMap <Integer, Integer> arrMap = new HashMap();
        for (int i = 0; i < nums.length; i++)
            arrMap.put(nums[i], i);
        for (int i = 0; i < nums.length; i++){
            if (!arrMap.containsKey(i))
                return i;
        }
        return nums.length;
    }
}