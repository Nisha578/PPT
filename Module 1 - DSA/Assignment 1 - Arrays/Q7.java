/*
💡 Q7. Given an integer array nums, move all 0's
to the end of it while maintaining the relative
order of the nonzero elements.

Note that you must do this in-place without
making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

 */

public class Q7 {
    public static void moveZerotoEnd(int[] nums) {
        int count = 0;

        for(int i = 0; i<=nums.length-1; i++) {
            if(nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        while(count < nums.length){
            nums[count++] = 0;
        }
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZerotoEnd(nums);
        for(int i = 0; i<=nums.length-1; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
