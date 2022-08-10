// URL: https://leetcode.com/problems/running-sum-of-1d-array/

public class RunningArraySum {
    public int[] runningSum(int[] nums) {
        int runningSum = 0;
        for (int i = 0; i < nums.length; i++){
            runningSum += nums[i];
            nums[i] = runningSum;
        }
        return nums;
    }
}