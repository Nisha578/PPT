import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*

💡 **Q1.** Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.

You can return the answer in any order.

**Example:**
Input: nums = [2,7,11,15], target = 9
Output0 [0,1]

**Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1][

 */

public class Question1 {

    public static int[] targetsum(int[] nums,int target) {
          int[] result = new int[2];
          HashMap<Integer, Integer> map = new HashMap<>();
          for(int i = 0; i<nums.length; i++) {
              int difference = target - nums[i];
              if(map.containsKey(difference)) {
                  result[0] = i;
                  result[1] = map.get(difference);
                  return result;
              }
              map.put(nums[i], i);
          }
          return result;
    }


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
       int[] ans = targetsum(nums,target);
       for (int i = 0; i<ans.length; i++) {
           System.out.print(ans[i] + " ");
       }


    }
}
