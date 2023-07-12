
/*
<aside>
💡 **Question 7**
You are given an m x n matrix M initialized with all 0's and an array of operations ops, where ops[i] = [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.

Count and return *the number of maximum integers in the matrix after performing all the operations*

**Example 1:**

**Input:** m = 3, n = 3, ops = [[2,2],[3,3]]

**Output:** 4

**Explanation:** The maximum integer in M is 2, and there are four of it in M. So return 4.

</aside>
 */

public class Qu_7 {
    public static int maxCount(int m, int n, int[][] ops) {
        int[] common = new int[] {m,n};
        for(int[] op : ops){
            common[0] = Math.min(common[0], op[0]);
            common[1] = Math.min(common[1], op[1]);
        }
        return common[0] * common[1];
    }
    public static void main(String[] args) {
        int m = 3, n = 3;
        int[][] ops = {{2,2},{3,3}};
        int ans = maxCount(m,n,ops);
        System.out.println(ans);
    }
}
