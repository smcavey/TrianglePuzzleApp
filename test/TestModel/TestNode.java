package TestModel;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
import model.Node;
import model.Model;
import view.TrianglePuzzleApp;

public class TestNode extends TestCase{
	
	Model model = new Model();
	TrianglePuzzleApp tpa = new TrianglePuzzleApp(model);
	Node node = new Node(10, 20, 30, 40, false);
	
	@Test
	void testConstruction() {
		Node node = new Node(10, 20, 30, 40, false);
		assertEquals(10, node.xCoord);
		assertEquals(20, node.yCoord);
		assertEquals(30, node.width);
		assertEquals(40, node.height);
		assertEquals(false, node.isSelected);
	}
	
	@Test
	void testGetXCoord() {
		assertEquals(10, node.getXCoord());
	}
	
	@Test
	void testGetYCoord() {
		assertEquals(20, node.getYCoord());
	}
	
	@Test
	void testGetWidth() {
		assertEquals(30, node.getWidth());
	}
	
	@Test
	void testGetHeight() {
		assertEquals(40, node.getHeight());
	}
	
	@Test
	void testGetIsSelected() {
		assertEquals(false, node.getIsSelected());
	}
	
	@Test
	void testSetIsSelected() {
		node.setIsSelected(true);
		assertEquals(true, node.getIsSelected());
	}
}
