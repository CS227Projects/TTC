
public class BasicTTC {
	String[][] board = {{"-", "-", "-"},
						{"-", "-", "-"},
						{"-", "-", "-"}};
	
	public BasicTTC() {
	}
	/*
	 * @param player
	 * whether the player is x or o
	 * 
	 * @param row
	 * the row intending to have a mark placed
	 * 
	 * @param col
	 * the column intending to have a mark placed
	 * 
	 * checks that the space at [row][col] is "-", or empty
	 * fills it and returns true if empty
	 * 
	 * returns false if full. does no mutation
	 */
	public boolean mark(String player, int row, int col) {
		if (board[row][col].equals("-")) {
			board[row][col] = player;
			return true;
		}
		return false;
	}
	
	/*
	 * @param player
	 * whether check for an o or x victory
	 * 
	 * checks horiz, diag, and vert
	 */
	public boolean isWin(String player) {
		for (int i = 0; i < board.length; i++) {
			boolean vertWin = true;
			boolean horizWin = true;
			for (int j = 0; j < board.length; j++) {
				if (!board[i][j].equals(player)) {
					horizWin = false;
				}
				if (!board[j][i].equals(player)) {
					vertWin = false;
				}
			}
			if (vertWin || horizWin) {
				return true;
			}
		}
		boolean leftDiag = true;
		boolean rightDiag = true;
		for (int k = 0; k < board.length; k++) {
			if (!board[k][k].equals(player)) {
				leftDiag = false;
			}
			if (!board[2-k][2-k].equals(player)) {
				rightDiag = false;
			}
		}
		return (leftDiag||rightDiag);
	}
	
	/*
	 * Prints out the board
	 */
	public String toString() {
		String x = "";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				x += (" " + board[i][j] + " |");
			}
			x += "\n";
		}
		return x;
	}
}
