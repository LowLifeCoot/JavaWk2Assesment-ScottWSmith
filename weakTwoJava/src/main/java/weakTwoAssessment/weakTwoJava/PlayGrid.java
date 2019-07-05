package weakTwoAssessment.weakTwoJava;

import java.util.Random;

public class PlayGrid {
	// Additional feature: Custom size grid - ask user for grid size and use input
	// as new char[input a][input b]

	// Randomiser
	Random randX = new Random();
	// Random Size array
	int rows = randX.nextInt(2) + 2;
	int columns = randX.nextInt(2) + 2;

	// Create a Grid that is 3x3
	char twoDGrid[][] = new char[rows][columns];

	// String to represent Player and End goal
	char player = 'P';
	char endGoal = 'E';

	// Location for finding Player and End Goal
	int pRow = 0;
	int pColumn = 1;

	int gRow = 0;
	int gColumn = 0;

	// The grid should contain . for empty, P for player position or G for goal
	// ONLY ON START!!
	public void populateGrid() {
		// Additional Features: Random start and end goals
		// Random randY = new Random();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				// Search Grid here
				if (twoDGrid[i][j] == twoDGrid[gRow][gColumn]) {
					twoDGrid[i][j] = endGoal;
				} else if (twoDGrid[i][j] == twoDGrid[pRow][pColumn]) {
					twoDGrid[i][j] = player;
				} else {
					twoDGrid[i][j] = '.';
				}
				System.out.println("Row is: " + i + ", Coloumn is: " + j + " " + twoDGrid[i][j]);
			}
		}
	}

	// Search the Grid
	public void gridSearch() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				// Search Grid here
//				if (twoDGrid[i][j] == search) {
//					// System.out.println(search + " is at Row: " + i + ", Coloum: " + j);
//				}
//				else {
//					
//				}
				System.out.println("Row is: " + i + ", Coloumn is: " + j + " " + twoDGrid[i][j]);
				// if (twoDGrid[i][j] == 'P') {
				// pRow = i;
				// pColoumn = j;
				// System.out.println("Player" + " is at Row: " + i + ", Coloum: " + j);
				// }
			}
		}
	}

	public void updateGrid(int cRow, int cColumn) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				// Search Grid here
				if (twoDGrid[i][j] == twoDGrid[pRow][pColumn]) {
					twoDGrid[cRow][cColumn] = 'P';
				} else if (twoDGrid[i][j] == 'P') {
					twoDGrid[i][j] = '.';
				}
			}
		}
	}
}
