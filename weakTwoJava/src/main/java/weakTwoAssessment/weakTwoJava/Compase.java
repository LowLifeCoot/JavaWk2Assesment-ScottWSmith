package weakTwoAssessment.weakTwoJava;

public class Compase extends Player {

	private double distToGoal;
	PlayGrid pg = new PlayGrid();

	// Get player location and End location
	// a2 = b2 + c2
	// a = player* + goal*
	// Return as dist(M)
	public double getDistToGoal(int b, int c) {
		distToGoal = Math.hypot(b, c);
		System.out.println("Distance is: " + distToGoal + " in M");
		return distToGoal;
	}

	public void setDistToGoal(long distToGoal) {
		this.distToGoal = distToGoal;
	}

}
