//URL: https://leetcode.com/problems/binary-search/submissions/

public class BinarySearch {
    public int search(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length -1;
        int midpoint, curr;
        while (start <= end){
            midpoint = (end + start) / 2;
            curr = nums[midpoint];
            if (curr == target){
                return midpoint;
            }
            if (curr < target){
                start = midpoint + 1;
            }
            else if (curr > target){
                end = midpoint - 1;
            }
        }
        return index;
    }
}