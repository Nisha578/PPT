
/*

💡 **Question 3**
Given a 2D integer array matrix, return *the **transpose** of* matrix.

The **transpose** of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

**Example 1:**

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]

Output: [[1,4,7],[2,5,8],[3,6,9]]

 */

public class Qu_3 {
    public static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans = transpose(matrix);
        System.out.println("[");
        for(int i =0; i< ans.length; i++) {
            System.out.print("[");
            for(int j = 0; j<ans[i].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();

        }
        System.out.print("]");
    }
}
