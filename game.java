import java.util.Scanner;
public class game {

	public static void main(String[] args) {
		boolean inGame = true;
		BasicTTC x = new BasicTTC();
		Scanner scan = new Scanner(System.in);
		while (inGame) {
			boolean valid = false;
			while (!valid) {
				System.out.println(x);
				System.out.println("X's turn. Pick a row:");
				int row = scan.nextInt()-1;
				System.out.println("Pick a column:");
				int col = scan.nextInt()-1;
				if (x.mark("X", row, col)) {
					valid = true;
				}
				else {
					System.out.println("Invalid Coordinate. Pick another!");
				}
			}
			if (x.isWin("X")) {
				inGame = false;
				System.out.println("X wins!");
			}
			
			if (inGame) {
				valid = false;
				while (!valid) {
					System.out.println(x);
					System.out.println("O's turn. Pick a row:");
					int row = scan.nextInt()-1;
					System.out.println("Pick a column:");
					int col = scan.nextInt()-1;
					if (x.mark("O", row, col)) {
						valid = true;
					}
					else {
						System.out.println("Invalid Coordinate. Pick another!");
					}
				}
				if (x.isWin("O")) {
					inGame = false;
					System.out.println("O wins!");
				}
			}
		}
		scan.close();
	}

}
