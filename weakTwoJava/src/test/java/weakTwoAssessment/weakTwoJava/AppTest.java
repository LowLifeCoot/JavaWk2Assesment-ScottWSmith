package weakTwoAssessment.weakTwoJava;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	PlayGrid pg = new PlayGrid();
	
	@Test
	public void createGrid() {
		assertNotNull(pg.twoDGrid);
	}
	
	@Test
	public void populateGrid() {
		
	}
}
