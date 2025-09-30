// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
        int minRow = grid.length, maxRow = -1;
        int minCol = grid[0].length, maxCol = -1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == ch) {
                    if (i < minRow) minRow = i;
                    if (i > maxRow) maxRow = i;
                    if (j < minCol) minCol = j;
                    if (j > maxCol) maxCol = j;
                }
            }
        }
        if (maxRow == -1) return 0;
        return (maxRow - minRow + 1) * (maxCol - minCol + 1);
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
    public int countPlus() {
        int rows = grid.length;
        int cols = grid[0].length;
        int cnt = 0;

        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                char c = grid[i][j];

                int up = countDir(i, j, -1, 0, c, rows, cols);
                int down = countDir(i, j, 1, 0, c, rows, cols);
                int left = countDir(i, j, 0, -1, c, rows, cols);
                int right = countDir(i, j, 0, 1, c, rows, cols);

                if (up >= 2 && up == down && up == left && up == right) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private int countDir(int r, int c, int dr, int dc, char ch, int rows, int cols) {
        int len = 0;
        r += dr;
        c += dc;
        while (r >= 0 && r < rows && c >= 0 && c < cols && grid[r][c] == ch) {
            len++;
            r += dr;
            c += dc;
        }
        return len;
    }
}
