
/*
Question 5
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

Example 1:
Input: nums = [1,2,3]
Output: 6
 */

public class Q_5 {

        public static int maxProduct(int[] nums) {
            int max = nums[0], min = nums[0], ans = nums[0];
            int n = nums.length;

            for (int i = 1; i < n; i++) {

                // Swapping min and max
                if (nums[i] < 0){
                    int temp = max;
                    max = min;
                    min = temp;
                }



                max = Math.max(nums[i], max * nums[i]);
                min = Math.min(nums[i], min * nums[i]);


                ans = Math.max(ans, max);
            }

            return ans;

        }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int ans = maxProduct(nums);
        System.out.println(ans);
    }
}
