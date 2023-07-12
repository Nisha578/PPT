
/*

💡 **Question 4**

Given a binary array nums, return *the maximum length of a contiguous subarray with an equal number of* 0 *and* 1.

**Example 1:**

**Input:** nums = [0,1]

**Output:** 2

**Explanation:**

[0, 1] is the longest contiguous subarray with an equal number of 0 and 1.


 */

import java.util.HashMap;
import java.util.Map;

public class Que_4 {
    public static int findMaxLength(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] == 0) {
                nums[i] = -1;
            }
        }

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int prefixSum = 0;
        int maxLen = 0;
        for(int i = 0; i<nums.length; i++) {
            prefixSum = prefixSum + nums[i];
            if(map.containsKey(prefixSum)) {
                if(maxLen < i - map.get(prefixSum)) {
                    maxLen = i - map.get(prefixSum);
                }
            }
            map.putIfAbsent(prefixSum,i);
        }
        return maxLen;

    }

    public static void main(String[] args) {
       int[] nums = {0,1};
        int a = findMaxLength(nums);
        System.out.println(a);
    }
}
