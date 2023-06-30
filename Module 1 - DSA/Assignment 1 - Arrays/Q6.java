
/*
 <aside>
💡 Q6. Given an integer array nums, return true if any value appears at least twice in the array,
 and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]

Output: true
 */


import java.util.HashSet;
import java.util.Set;

public class Q6 {

    public static boolean checkDuplicate(int[] nums) {
         Set<Integer> set = new HashSet<>();
         for(Integer x : nums) {
             if(set.contains(x)) {
                 return true;
             }
             set.add(x);
         }
         return false;
    }

    public static void main(String[] args) {
      int[] nums = {1,2,3,1};
      boolean ans = checkDuplicate(nums);
        System.out.print(ans);
    }
}
