
/*
Question 1
Given an integer array nums of length n and an integer target, find three integers
in nums such that the sum is closest to the target.
Return the sum of the three integers.

You may assume that each input would have exactly one solution.

Example 1:
Input: nums = [-1,2,1,-4], target = 1
Output: 2

Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */

import java.util.Arrays;

public class Qu1 {
    public static int threeSum(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[nums.length-1];
        for(int i = 0;i<nums.length; i++) {
            int start = i+1;
            int end = nums.length - 1;
            while(start < end) {
                int currSum = nums[i] + nums[start] + nums[end];
                if(currSum > target) {
                    end--;
                }
                else {
                    start++;
                }
                if(Math.abs(currSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currSum;
                }
            }

        }
        return closestSum;
    }
    public static void main(String[] args) {
          int nums[] = {-1,2,1,-4};
          int target = 1;
          int output = threeSum(nums,target);
        System.out.println(output);
    }
}
