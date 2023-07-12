
/*
Question 6
Given a non-empty array of integers nums, every element appears twice except
for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only
constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1
 */

import java.util.Arrays;

public class Qu6 {
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for(int i = 1; i<nums.length; i += 2){
            if(nums[i] != nums[i-1]){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int ans = singleNumber(nums);
        System.out.println(ans);
    }
}
