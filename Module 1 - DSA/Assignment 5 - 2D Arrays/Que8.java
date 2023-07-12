
/*

💡 **Question 8**

An integer array original is transformed into a **doubled** array changed by appending **twice the value** of every element in original, and then randomly **shuffling** the resulting array.

Given an array changed, return original *if* changed *is a **doubled** array. If* changed *is not a **doubled** array, return an empty array. The elements in* original *may be returned in **any** order*.

**Example 1:**

**Input:** changed = [1,3,4,2,6,8]

**Output:** [1,3,4]

**Explanation:** One possible original array could be [1,3,4]:

- Twice the value of 1 is 1 * 2 = 2.
- Twice the value of 3 is 3 * 2 = 6.
- Twice the value of 4 is 4 * 2 = 8.

Other original arrays could be [4,3,1] or [3,1,4].


 */

import java.util.*;

public class Que8 {
    public static List<Integer> findOriginal(int[] nums) {
        Map<Integer,Integer> numFreq = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            numFreq.put(nums[i],numFreq.getOrDefault(nums[i],0)+1);
        }

        Arrays.sort(nums);

        List<Integer> res = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
            int freq = numFreq.get(nums[i]);
            if(freq>0) {
                res.add(nums[i]);
                numFreq.put(nums[i],freq-1);

                int twice = 2*nums[i];
                numFreq.put(twice,numFreq.get(twice)-1);
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        List<Integer> list = findOriginal(changed);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

}
