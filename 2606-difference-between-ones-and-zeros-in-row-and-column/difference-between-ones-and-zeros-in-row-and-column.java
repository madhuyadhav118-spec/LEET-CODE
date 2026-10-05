class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int diff[][] = new int[m][n];
        int row[] = new int[m];
        int col[] = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    row[i]++;
                    col[j]++;
                }
            }
        }

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                int rowZero = m-row[i];
                int colZero = n-col[j];
                diff[i][j] = row[i]+col[j]-rowZero-colZero;
            }
        }
        return diff;   
    }
}