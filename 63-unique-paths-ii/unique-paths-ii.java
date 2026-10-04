class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                // Obstacle
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0;
                }

                // Starting cell
                else if (i == 0 && j == 0) {
                    obstacleGrid[i][j] = 1;
                }

                // First row
                else if (i == 0) {
                    obstacleGrid[i][j] = obstacleGrid[i][j - 1];
                }

                // First column
                else if (j == 0) {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j];
                }

                // Other cells
                else {
                    obstacleGrid[i][j] =
                        obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                }
            }
        }

        return obstacleGrid[m - 1][n - 1];
    }
}