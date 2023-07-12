
/*
Question 7
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is
monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

Example 1:
Input: nums = [1,2,2,3]
Output: true
 */

public class Q_7 {
    public static boolean isMonotonic(int[] nums) {
        boolean increasing = false, decreasing = false;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] < nums[i-1]) decreasing = true;
            if(nums[i] > nums[i-1]) increasing = true;
        }
        return increasing && decreasing ? false : true;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        boolean ans = isMonotonic(nums);
        System.out.println(ans);
    }
}
