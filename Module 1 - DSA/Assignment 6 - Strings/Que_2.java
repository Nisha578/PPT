
/*
<aside>
💡 **Question 2**

You are given an m x n integer matrix matrix with the following two properties:

- Each row is sorted in non-decreasing order.
- The first integer of each row is greater than the last integer of the previous row.

Given an integer target, return true *if* target *is in* matrix *or* false *otherwise*.

You must write a solution in O(log(m * n)) time complexity.

**Example 1:**

**Input:** matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3

**Output:** true

</aside>
 */

public class Que_2 {

    public static boolean search(int[][] matrix,int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        if(m == 0) {
            return false;
        }

        int low = 0; int high = m*n-1;

        int midIdx,midElement,rowIdx,colIdx;

        while(low<= high) {
            midIdx = low + (high-low)/2;
            rowIdx = midIdx/n;
            colIdx = midIdx % n;

            midElement = matrix[rowIdx][colIdx];

            if(target == midElement) {
                return true;
            }
            else {
                if(target < midElement) {
                    high = midIdx - 1;
                }
                else {
                    low = midIdx + 1;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        boolean ans = search(matrix,target);
        System.out.print(ans);
    }
}
