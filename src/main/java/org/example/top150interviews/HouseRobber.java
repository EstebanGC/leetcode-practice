package org.example.top150interviews;

import java.util.Arrays;

public class HouseRobber {
//    House Robber
//
//    You are a professional robber planning
//    to rob houses along a street. Each house
//    has a certain amount of money stashed, the
//    only constraint stopping you from robbing
//    each of them is that adjacent houses have
//    security systems connected and it will
//    automatically contact the police if two
//    adjacent houses were broken into on the
//    same night.
//
//    Given an integer array nums representing
//    the amount of money of each house, return
//    the maximum amount of money you can rob tonight
//    without alerting the police.

    public int rob(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i += 2){
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        HouseRobber houseRobber = new HouseRobber();

        int[] money = {2,5,6,3,4,8,6,5,2,3,8,9};

        int maxMoney = houseRobber.rob(money);

        System.out.println("The maximum amount of money he can rob is:  " + maxMoney);

    }

}
