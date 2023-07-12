
/*
Question 4
Given a sorted array of distinct integers and a target value, return the index if the
target is found. If not, return the index where it would be if it were inserted in
order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
 */

public class Qu4 {
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
        int[] nums = {1,3,5,6};
        int target = 5;
        int index = search(nums,target);
        System.out.println(index);
    }
}
