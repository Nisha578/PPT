
/*

💡 **Question 8**

Given two [sparse matrices](https://en.wikipedia.org/wiki/Sparse_matrix) mat1 of size m x k and mat2 of size k x n, return the result of mat1 x mat2. You may assume that multiplication is always possible.

**Example 1:**
**Input:** mat1 = [[1,0,0],[-1,0,3]], mat2 = [[7,0,0],[0,0,0],[0,0,1]]

**Output:**

[[7,0,0],[-7,0,3]]
 */

public class Que_8 {
    public static int[][] multiply(int[][] A, int[][] B){
            if(A == null || B == null) return null;
            int[][] res = new int[A.length][B[0].length];
            for(int r = 0; r<res.length; r++){
                for(int c  = 0; c<res[0].length; c++) {
                    int tmpSum = 0;
                    for(int len = 0; len<A[0].length; len++){
                        tmpSum += A[r][len] * B[len][c];
                    }
                    res[r][c] = tmpSum;
                }
            }
            return res;
    }

    public static void main(String[] args) {
      int[][]  mat1 = {{1,0,0},{-1,0,3}}, mat2 = {{7,0,0},{0,0,0},{0,0,1}};
      int[][] ans = multiply(mat1,mat2);
        System.out.print("[");
      for(int i = 0; i<ans.length; i++){
          System.out.print("[");
          for(int j = 0; j<ans[0].length; j++){
              System.out.print(ans[i][j]+" ");
          }
          System.out.print("]");
      }
        System.out.print("]");
    }
}
