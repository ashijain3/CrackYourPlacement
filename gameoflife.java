public class gameoflife {
    public static void gameOfLife(int[][] board) {
        int ROWS = board.length;
        int COLS = board[0].length;

        // Original | New | State
        //     0    |  0  |  0
        //     1    |  0  |  1
        //     0    |  1  |  2
        //     1    |  1  |  3

        // First pass: Update board with temporary values
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                int nei = countNeighbors(board, r, c, ROWS, COLS);
                if (board[r][c] == 1) {
                    if (nei == 2 || nei == 3) {
                        board[r][c] = 3; // Mark as 1 in the new state
                    }
                } else {
                    if (nei == 3) {
                        board[r][c] = 2; // Mark as 1 in the new state
                    }
                }
            }
        }

        // Second pass: Finalize the board state
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (board[r][c] == 1) {
                    board[r][c] = 0; // New state 0
                } else if (board[r][c] == 2 || board[r][c] == 3) {
                    board[r][c] = 1; // New state 1
                }
            }
        }
    }

    // Function to count the number of live neighbors
    private static int countNeighbors(int[][] board, int r, int c, int ROWS, int COLS) {
        int nei = 0;
        for (int i = r - 1; i <= r + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {
                if (i == r && j == c || i < 0 || j < 0 || i >= ROWS || j >= COLS) {
                    continue;
                }
                if (board[i][j] == 1 || board[i][j] == 3) {
                    nei++;
                }
            }
        }
        return nei;
    }

    public static void main(String[] args) {
        int[][] board = {
            {0, 1, 0},
            {0, 0, 1},
            {1, 1, 1},
            {0, 0, 0}
        };
    
        System.out.println("Initial Board:");
        printBoard(board);
    
        gameOfLife(board);
    
        System.out.println("After Game of Life:");
        printBoard(board);
    }
    
    private static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//time complexity -O(m*n)
//space complexity -O(1)
