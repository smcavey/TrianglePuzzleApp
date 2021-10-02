package TestModel;
import model.Edge;
import model.Model;
import model.Node;
import view.TrianglePuzzleApp;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
import java.awt.Color;

public class TestEdge extends TestCase {
	
	Model model = new Model();
	TrianglePuzzleApp tpa = new TrianglePuzzleApp(model);
	Node nodeOne = new Node(10, 10, 10, 10, false);
	Node nodeTwo = new Node(10, 10, 10, 10, false);
    Edge edge = new Edge("testEdge", nodeOne, nodeTwo, 20, 20, 100, 100, Color.red, false);
    
    @Test
    void testConstruction() {
    	Edge edge = new Edge("testEdge", nodeOne, nodeTwo, 20, 20, 100, 100, Color.red, false);
    	assertEquals("testEdge", edge.ID);
    	assertEquals(nodeOne, edge.thisNode);
    	assertEquals(nodeTwo, edge.thatNode);
    	assertEquals(20, edge.xOneCoord);
    	assertEquals(20, edge.xTwoCoord);
    	assertEquals(100, edge.yOneCoord);
    	assertEquals(100, edge.yTwoCoord);
    	assertEquals(Color.red, edge.color);
    	assertEquals(false, edge.isSelected);
    }
    
    @Test
    void testGetID() {
    	assertEquals("testEdge", edge.getID());
    }
    
    @Test
    void testGetThisNode() {
    	assertEquals(nodeOne, edge.getThisNode());
    }
    
    @Test
    void testGetThatNode() {
    	assertEquals(nodeTwo, edge.getThatNode());
    }
    
    @Test
    void testGetXOneCoord() {
    	assertEquals(20, edge.getXOneCoord());
    }
    
    @Test
    void testGetXTwoCoord() {
    	assertEquals(20, edge.getXTwoCoord());
    }
    
    @Test
    void testGetYOneCoord() {
    	assertEquals(100, edge.getYOneCoord());
    }
    
    @Test
    void testGetYTwoCoord() {
    	assertEquals(100, edge.getYTwoCoord());
    }
    
    @Test
    void testGetColor() {
    	assertEquals(Color.red, edge.getColor());
    }
    
    @Test
    void testSetColor() {
    	edge.setColor(Color.blue);
    	assertEquals(Color.blue, edge.getColor());
    }
    
    @Test
    void testGetIsSelected() {
    	assertEquals(false, edge.getIsSelected());
    }
    
    @Test
    void testSetIsSelected() {
    	edge.setIsSelected(true);
    	assertEquals(true, edge.getIsSelected());
    }
    
    
}
