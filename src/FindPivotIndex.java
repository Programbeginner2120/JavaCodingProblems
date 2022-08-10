// URL: https://leetcode.com/problems/find-pivot-index/

class FindPivotIndex {
    private int findSum(int [] arr){
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        return sum;
    }

    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = this.findSum(nums);
        for (int i = 0; i < nums.length; i++){
            rightSum -= nums[i];
            if (leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}