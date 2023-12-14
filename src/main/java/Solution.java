public class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] rowSums = new int[n];
        int[] columnSums = new int[m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    rowSums[i]++;
                    columnSums[j]++;
                }else{
                    rowSums[i]--;
                    columnSums[j]--;
                }
            }
        }
        int[][] diff = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                diff[i][j] = rowSums[i] + columnSums[j];
            }
        }
        return diff;
    }
}
