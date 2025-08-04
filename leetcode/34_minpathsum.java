

//minimum path sum in a grid
import java.util.Arrays;
class minpathsum {
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    continue; // Starting point
                }
                int fromTop = (i > 0) ? grid[i - 1][j] : Integer.MAX_VALUE;
                int fromLeft = (j > 0) ? grid[i][j - 1] : Integer.MAX_VALUE;
                grid[i][j] += Math.min(fromTop, fromLeft);
            }
        }

        return grid[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 3, 2},
            {1, 0, 1},
            {4, 2, 5}
        };
        System.out.println("Minimum path sum: " + minPathSum(grid)); // Output: 7
    }
}
