
/*

💡 **Question 7**

Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
**Input:** n = 3

**Output:** [[1,2,3],[8,9,4],[7,6,5]]

 */

public class Que_7 {

        public static int[][] generateMatrix(int n) {
            int[][] matrix = new int[n][n];
            int colStart = 0;
            int rowStart = 0;
            int rowEnd = n-1;
            int colEnd = n-1;
            int count = 1;

            while(rowStart <= rowEnd && colStart <= colEnd){
                for(int i=colStart; i<=colEnd; i++){
                    matrix[rowStart][i] = count++;
                }
                rowStart++;
                for(int i=rowStart; i<=rowEnd; i++){
                    matrix[i][colEnd] = count++;
                }
                colEnd--;
                for(int i = colEnd; i>=colStart; i--){
                    matrix[rowEnd][i] = count++;
                }
                rowEnd--;
                for(int i = rowEnd; i>=rowStart; i--){
                    matrix[i][colStart] = count++;
                }
                colStart++;
            }
            return matrix;
        }

    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = generateMatrix(n);
        System.out.print("[");
        for(int i =0; i<matrix.length; i++) {
            System.out.print("[");
            for(int j = 0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j]+",");
            }
            System.out.print("]");

        }
        System.out.print("]");
    }
}
