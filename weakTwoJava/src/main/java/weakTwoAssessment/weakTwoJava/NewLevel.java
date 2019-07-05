package weakTwoAssessment.weakTwoJava;

import java.util.Scanner;

public class NewLevel {
	PlayGrid pg = new PlayGrid();
	Compase c = new Compase();

	Scanner scan = new Scanner(System.in);

	private Integer direction = 0;
	private boolean hasWon = false;

	private Integer checkDirection() {
		while (direction != 1 & direction != 2 & direction != 3 & direction != 4) {
			System.out.println("Please Enter: 1 for North, 2 for South, 3 for East or 4 for West");
			direction = scan.nextInt();
			if (direction == 1) {
				if (pg.pRow < pg.rows - 1 & pg.pRow >= 0) {
					System.out.println(pg.pRow);
					pg.pRow++;
				} else {
					pg.pRow = 0;
				}
			}
			if (direction == 2) {
				if (pg.pRow <= pg.rows - 1 & pg.pRow >= 0) {
					pg.pRow--;
				} else {
					pg.pRow = 0;
				}
			}
			if (direction == 3) {
				if (pg.pColumn <= pg.pColumn - 1 & pg.pColumn >= 0) {
					pg.pColumn++;
				} else {
					pg.pColumn = 0;
				}
			}
			if (direction == 4) {
				if (pg.pColumn <= pg.pColumn - 1 & pg.pColumn >= 0) {
					pg.pColumn--;
				} else {
					pg.pColumn = 0;
				}
			}
			pg.updateGrid(pg.pRow, pg.pColumn);
			pg.gridSearch();
			hasWon();
			c.getDistToGoal(pg.pRow + pg.gRow, pg.gColumn + pg.gRow);
			direction = 0;
		}
		// Add a throw here to stop any character inputs
		return direction;
	}

	public void playerInput() {
		pg.populateGrid();
		while (hasWon == false) {
			checkDirection();
		}
	}

	public void hasWon() {
		if (pg.pColumn == pg.gColumn && pg.pRow == pg.gRow) {
			System.out.println("Win Con Met");
			hasWon = true;
			scan.close();
		} else {
			System.out.println("Win Con not met");
			hasWon = false;
		}
	}

	// // To cause an "Endless" effect
	// public void overTheRow(int row) {
	// if (row < pg.gRow) {
	// pg.gRow = 0;
	// }
	// }
	//
	// public void overTheColumn(int column) {
	// if (column <= pg.gColumn & column > 0) {
	// pg.gColumn = 0;
	// } else {
	// pg.pColumn++;
	// }
}
