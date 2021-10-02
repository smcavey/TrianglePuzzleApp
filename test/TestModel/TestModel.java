package TestModel;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
import model.Model;
import model.TrianglePuzzle;

public class TestModel extends TestCase{
	
	protected Model model = new Model();
	TrianglePuzzle puzzle = new TrianglePuzzle();
	
	@Test
	void testConstruction() {
		Model model = new Model();
	}
	
	@Test
	void testSetPuzzle() {
		assertFalse(model.puzzle.equals(null));
	}
	
	@Test
	void testGetPuzzle() {
		assertFalse(!model.getPuzzle().equals(null));
	}
	
	@Test
	void testGetSetHasWon() {
		model.setHasWon(false);
		assertEquals(false, model.getHasWon());
	}

}
