/*
 * Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

 

Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
Example 2:

Input: grid = [[3,2],[1,0]]
Output: 0
 */
public class CountNegativeNumberInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int n = grid.length;
        for(int i = 0; i < n; i++){
            for(int j = grid[0].length - 1; j >= 0; j--){
                if(grid[i][j] < 0) count++;
                else break;
            }
        }
        return count;
    }
}
