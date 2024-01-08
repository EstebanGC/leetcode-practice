package org.example.top150interviews;

public class RemoveElement {
    public int removeElement(int[] nums, int val){
        int k = 0;

        for (int i=0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {

        int[] nums = {3, 8, 5, 2, 8, 4, 6};
        int val = 8;

        RemoveElement removeElement = new RemoveElement();

        int newLength = removeElement.removeElement(nums, val);


        System.out.print("New array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nNew array length: " + newLength);
    }
}


