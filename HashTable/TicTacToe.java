package HashTable;

import java.util.*;

class TicTacToe {
    int n;
    int[] rowSum;
    int[] colSum;
    int diag;
    int revDiag;

    public TicTacToe(int n) {
        this.n = n;
        rowSum = new int[n];
        colSum = new int[n];
        diag = 0;
        revDiag = 0;
    }

    public int move(int r, int c, boolean me) {
        // Step 1) Make a move
        int val = me ? 1 : -1;
        rowSum[r] += val;
        colSum[c] += val;

        if (r == c)
            diag += val;
        if (r == n - c - 1)
            revDiag += val;

        // Step 2) Check if game over
        boolean gameOver = Math.abs(rowSum[r]) == n || Math.abs(colSum[c]) == n
                || Math.abs(diag) == n || Math.abs(revDiag) == n;

        if (gameOver)
            return me ? 1 : -1;
        return 0;
    }
}