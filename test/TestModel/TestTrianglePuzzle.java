package TestModel;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
import model.TrianglePuzzle;

public class TestTrianglePuzzle extends TestCase {
	
	TrianglePuzzle tp = new TrianglePuzzle();
	
	@Test
	void testConstruction() {
		TrianglePuzzle tp = new TrianglePuzzle();
	}
	
	@Test
	void testSetScore() {
		tp.setScore(2);
		assertEquals(2, tp.score);
	}
	
	@Test
	void testGetScore() {
		tp.score = 0;
		assertEquals(0, tp.getScore());
	}
	
	@Test
	void testSetMoves() {
		tp.setMoves(3);
		assertEquals(3, tp.moves);
	}
	
	@Test
	void testGetMoves() {
		tp.moves = 5;
		assertEquals(5, tp.getMoves());
	}

}
