
/*
<aside>
💡 **Question 6**
Given an integer array nums sorted in **non-decreasing** order, return *an array of **the squares of each number** sorted in non-decreasing order*.

**Example 1:**

Input: nums = [-4,-1,0,3,10]

Output: [0,1,9,16,100]

**Explanation:** After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100]

</aside>
 */

public class Qu_6 {
    public static int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int[] arr = new int[nums.length];
        int l = nums.length-1;
        while(i<=j){
            int sq1 = nums[i]*nums[i];
            int sq2 = nums[j]*nums[j];
            if(sq1<sq2){
                arr[l--]=sq2;
                j--;
            }
            else{
                arr[l--] = sq1;
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] ans = sortedSquares(nums);
        for(int i = 0; i< ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
