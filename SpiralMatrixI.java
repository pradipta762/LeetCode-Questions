/*
 * Given an m x n matrix, return all elements of the matrix in spiral order.

 

Example 1:
1 → 2 → 3 
        ↓
4 → 5   6
↑        ↓
7 ← 8  ← 9
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:
1 → 2 → 3 → 4 
            ↓
5 → 6 → 7   8
↑            ↓
9 ← 10 ← 11 ←12

Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int topRow = 0;
        int leftCol = 0;
        int bottomRow = row - 1;
        int rightCol = col - 1;
        int size = row * col;
        int k = 0;
        while (k < size) {
            // topRow : leftCol → rightCol
            for (int i = leftCol; i <= rightCol && k < size; i++) {
                ans.add(matrix[topRow][i]);
                k++;
            }
            topRow++;

            // rightCol : topRow → bottomRow
            for (int i = topRow; i <= bottomRow && k < size; i++) {
                ans.add(matrix[i][rightCol]);
                k++;
            }
            rightCol--;

            // bottomRow : rightCol → leftCol
            for (int i = rightCol; i >= leftCol && k < size; i--) {
                ans.add(matrix[bottomRow][i]);
                k++;
            }
            bottomRow--;

            // leftCol : bottomRow → topRow
            for (int i = bottomRow; i >= topRow && k < size; i--) {
                ans.add(matrix[i][leftCol]);
                k++;
            }
            leftCol++;

        }
        return ans;
    }
}
