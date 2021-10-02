package TestModel;
import model.Edge;
import model.Model;
import model.Node;
import model.Triangle;
import view.TrianglePuzzleApp;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
import java.awt.Color;

public class TestTriangle extends TestCase {
	
	Node nodeOne = new Node(10, 10, 10, 10, false);
	Node nodeTwo = new Node(20, 20, 20, 20, false);
	Node nodeThree = new Node(30, 30, 30, 30, false);
	Edge edgeOne = new Edge("edgeOne", nodeOne, nodeTwo, 20, 30, 100, 100, Color.red, false);
	Edge edgeTwo = new Edge("edgeTwo", nodeOne, nodeThree, 20, 40, 100, 200, Color.blue, false);
	Edge edgeThree = new Edge("edgeThree", nodeTwo, nodeThree, 30, 40, 100, 200, Color.green, false);
	Triangle triangleOne = new Triangle(1, edgeOne, edgeTwo, edgeThree, false, false, false);
	
	@Test
	void testConstruction() {
		Triangle triangleOne = new Triangle(1, edgeOne, edgeTwo, edgeThree, false, false, false);
		assertEquals(1, triangleOne.ID);
		assertEquals(edgeOne, triangleOne.edgeLeft);
		assertEquals(edgeTwo, triangleOne.edgeRight);
		assertEquals(edgeThree, triangleOne.edgeBottom);
		assertEquals(false, triangleOne.isSolid);
		assertEquals(false, triangleOne.isSelected);
		assertEquals(false, triangleOne.isBonusAdded);
	}
	
	@Test
	void testGetID() {
		assertEquals(1, triangleOne.getID());
	}
	
	@Test
	void testGetEdgeLeft() {
		assertEquals(edgeOne, triangleOne.getEdgeLeft());
	}
	
	@Test
	void testGetEdgeRight() {
		assertEquals(edgeTwo, triangleOne.getEdgeRight());
	}
	
	@Test
	void testGetEdgeBottom() {
		assertEquals(edgeThree, triangleOne.getEdgeBottom());
	}
	
	@Test
	void testGetIsSolid() {
		assertEquals(false, triangleOne.getIsSolid());
	}
	
	@Test
	void testGetIsSelected() {
		assertEquals(false, triangleOne.getIsSelected());
	}
	
	@Test
	void testGetIsBonusAdded() {
		assertEquals(false, triangleOne.getIsBonusAdded());
	}
	
	@Test
	void testSetIsSolid() {
		triangleOne.setIsSolid(true);
		assertEquals(true, triangleOne.isSolid);
	}
	
	@Test
	void testSetIsSelected() {
		triangleOne.setIsSelected(true);
		assertEquals(true, triangleOne.isSelected);
	}
	
	@Test
	void testSetIsBonusAdded() {
		triangleOne.setIsBonusAdded(true);
		assertEquals(true, triangleOne.isBonusAdded);
	}

}
