import java.util.Arrays;

public class SudokuSolver {
    private static final int SIZE = 6;
    private static final int[][] GRID = {
            {0, 0, 0, 3, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {3, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
    };

    public static void main(String[] args) {
        SudokuSolver solver = new SudokuSolver();
        if (solver.solve()) {
            solver.printGrid();
        } else {
            System.out.println("No solution exists.");
        }
    }

    private boolean solve() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (GRID[row][col] == 0) {
                    for (int num = 1; num <= SIZE; num++) {
                        if (isSafe(row, col, num)) {
                            GRID[row][col] = num;
                            if (solve()) {
                                return true;
                            }
                            GRID[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isSafe(int row, int col, int num) {
        for (int i = 0; i < SIZE; i++) {
            if (GRID[row][i] == num || GRID[i][col] == num) {
                return false;
            }
        }

        for (int i = 0; i < SIZE; i++) {
            if (GRID[i][col] == num) {
                return false;
            }
        }

        int startRow = row - row % 2;
        int startCol = col - col % 2;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (GRID[startRow + i][startCol + j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    private void printGrid() {
        for (int[] row : GRID) {
            System.out.println(Arrays.toString(row));
        }
    }
}
