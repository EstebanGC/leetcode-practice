package org.example.top150interviews;

public class RemoveElementsII {
    public int removeDuplicates(int[] nums) {
        if (nums.length<=1){
            return nums.length;
        }

        int k = 2;

        for (int i = 2; i < nums.length; i++) {
            if(nums[i] != nums[k-2]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
