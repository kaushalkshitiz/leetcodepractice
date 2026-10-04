class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        
        int[] rows = new int[m];
        int[] cols = new int[n];

        // Count how many times each row and column is incremented
        for (int[] index : indices) {
            rows[index[0]]++;
            cols[index[1]]++;
        }

        int oddRows = 0;
        int oddCols = 0;

        // Count odd rows
        for (int x : rows) {
            if (x % 2 != 0) {
                oddRows++;
            }
        }

        // Count odd columns
        for (int x : cols) {
            if (x % 2 != 0) {
                oddCols++;
            }
        }

        int evenRows = m - oddRows;
        int evenCols = n - oddCols;

        return oddRows * evenCols + evenRows * oddCols;
    }
}
