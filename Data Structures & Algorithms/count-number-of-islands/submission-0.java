class Solution {
    private static final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    // Time Complexity: O(n * m)
    // Space Complexity: O(n * m)
    public int numIslands(char[][] grid) {
        int ROWS = grid.length, COLS = grid[0].length;
        int islands = 0;

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (grid[row][col] == '1') {
                    islands++;
                    dfs(grid, row, col);
                }
            }
        }

        return islands;
    }

    private void dfs(char[][] grid, int row, int col) {
        boolean isOutOfBounds = row < 0 || col < 0 || row >= grid.length || col >= grid[0].length;

        if (isOutOfBounds || grid[row][col] == '0') {
            return;
        }

        grid[row][col] = '0';

        for (int[] dir : directions) {
            dfs(grid, row + dir[0], col + dir[1]);
        }
    }
}
