
/*

💡 **Question 6**

        Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears **once** or **twice**, return *an array of all the integers that appears **twice***.

        You must write an algorithm that runs in O(n) time and uses only constant extra space.

        **Example 1:**

        **Input:** nums = [4,3,2,7,8,2,3,1]

        **Output:**

        [2,3]


 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que6 {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                list.add(nums[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> a = findDuplicates(nums);
        for(int i =0;i<a.size(); i++){
            System.out.print(a.get(i)+ " ");
        }
    }
}
