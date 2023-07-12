
/*

💡 **Question 1**
Given three integer arrays arr1, arr2 and arr3 **sorted** in **strictly increasing** order,
 return a sorted array of **only** the integers that appeared in **all** three arrays.

**Example 1:**

Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]

Output: [1,5]

**Explanation:** Only 1 and 5 appeared in the three arrays.

 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Qu_1 {
    public static List<Integer> arraysIntersection(int[] arr1,int[] arr2, int[] arr3){
        Set<Integer> set1 = toSet(arr1), set2 = toSet(arr2);

        List<Integer> result = new ArrayList<>();
        for(int num : arr3) {
            if(set1.contains(num) && set2.contains(num)) {
                if(result.size() == 0) result.add(num);
                else if (result.size() > 0 && result.get(result.size() - 1) !=num) result.add(num);

            }
        }
        return result;

    }

    private static Set<Integer> toSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        return set;
    }

    public static void main(String[] args) {
       int[] arr1 = {1,2,3,4,5}, arr2 = {1,2,5,7,9}, arr3 = {1,3,4,5,8};
       List<Integer> ans = arraysIntersection(arr1,arr2,arr3);
       for(int i = 0; i<ans.size(); i++) {
           System.out.print(ans.get(i) +" ");
       }
    }
}
