class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');

        boolean[] col = new boolean[n];
        boolean[] diag = new boolean[2*n];
        boolean[] anti = new boolean[2*n];

        backtrack(0, n, board, col, diag, anti, res);
        return res;
    }

    private void backtrack(int r, int n, char[][] board,
                           boolean[] col, boolean[] diag, boolean[] anti,
                           List<List<String>> res) {

        if (r == n) {
            List<String> temp = new ArrayList<>();
            for (char[] row : board) temp.add(String.valueOf(row));
            res.add(temp);
            return;
        }

        for (int c = 0; c < n; c++) {
            int d = r - c + n;
            int a = r + c;
            if (col[c] || diag[d] || anti[a]) continue;

            col[c] = diag[d] = anti[a] = true;
            board[r][c] = 'Q';

            backtrack(r + 1, n, board, col, diag, anti, res);

            board[r][c] = '.';
            col[c] = diag[d] = anti[a] = false;
        }
    }
}
