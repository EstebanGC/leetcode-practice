package org.example.top150interviews;

public class MajorityElement {
    public static int majorityElement(int[] nums){
        int cand=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0) {
                cand=nums[i];
            }

            if(cand==nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return cand;

    }

    //MooreAlgorythm

    public int majorityElement1(int[] nums) {

        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int majority = majorityElement(nums);
        System.out.println("Majority element: " + majority);
    }
}
