// Problem: Remove Duplicates from Sorted Array
// URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class RemoveDuplicatesFromSorted {
    public int removeDuplicates(int[] nums) {
        int currentNum = Integer.MIN_VALUE; // used as a placeholder value
        int posOfRepeat = -1; // used as a placeholder value
        int k = 0;

        for (int i = 0; i < nums.length; i++){
            posOfRepeat = posOfRepeat == -1 && currentNum == nums[i] ? i : posOfRepeat;
            if (currentNum != nums[i]){
                currentNum = nums[i];
                if (posOfRepeat != -1){
                    int temp = nums[posOfRepeat];
                    nums[posOfRepeat] = nums[i];
                    nums[i] = temp;
                    k = posOfRepeat + 1;
                    posOfRepeat = k;
                }
            }
        }

        if (posOfRepeat > k)
            k = posOfRepeat;
        else if (posOfRepeat == -1)
            k = nums.length;

        return k;
    }
}

// Philosophy behind this soln. is that when a repeat is found, a swap will take place. After the swap, we must have
// unique elements from that point on, therefore we must have k unique elements and any additional repeating element
// will be the k+1th element, since there are k unique elements the k+1th element and onward must be non-unique by
// consequence.