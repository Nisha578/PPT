
/*
Question 6
Given an array of integers nums which is sorted in ascending order, and an integer target,
write a function to search target in nums. If target exists, then return its index. Otherwise,
return -1.

You must write an algorithm with O(log n) runtime complexity.

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4

Explanation: 9 exists in nums and its index is 4
 */

public class Q_6 {
    public static int search(int[] nums, int target) {
        return search(nums,0,nums.length-1,target);
    }
    public static int search(int[] nums,int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(target == nums[mid] ){
            return mid;
        }
        if(target<nums[mid]){
            return search(nums,start,mid-1,target);
        }
        else {
            return search(nums,mid+1,end,target);
        }

    }
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target  = 9;
        int ans = search(nums,target);
        System.out.println(ans);

    }
}
