class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int rowCount[] = new int[m];
        int colCount[] = new int[n];

        // for(int i = 0; i < m; i++) {
        //     int count = 0;
        //     for(int j =0;j < n; j++) {
        //         if(grid[i][j] == 1) {
        //             count++;
        //         }
                
        //     }
        //     rowCount[i] = count;
        // }
        // for(int i = 0; i < n; i++) {
        //     int count = 0;
        //     for(int j =0;j < m; j++) {
        //         if(grid[j][i] == 1) {
        //             count++;
        //         }
                
        //     }
        //     colCount[i] = count;
        // }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n;j++) {
                if(grid[i][j] ==1) {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }
        int res = 0;
        for(int i = 0 ; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    if(rowCount[i] > 1 || colCount[j] > 1) {
                        res++;
                    }
                }
            }
        }
        return res;
    }
}