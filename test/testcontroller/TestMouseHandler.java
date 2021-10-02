package testcontroller;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
import model.Model;
import view.TrianglePuzzleApp;
import TestModel.TestModel;
import controller.MouseHandler;
import java.awt.event.MouseEvent;

public class TestMouseHandler extends TestCase{
	
	TrianglePuzzleApp app;
	Model model;
	MouseHandler mh;
	
	@Test
	void testProcessOne() {
		Model model = new Model();
		model.setPuzzle();
		TrianglePuzzleApp app = new TrianglePuzzleApp(model);
		MouseHandler mh = new MouseHandler(model, app);
		model.setHasWon(false);
		MouseEvent click = new MouseEvent(app, MouseEvent.MOUSE_CLICKED, System.currentTimeMillis(), 210, 10, 10, 1, false);
		mh.mousePressed(click);
		app.setVisible(true);
	}
	
	@Test
	void testProcessTwo() {
		Model model = new Model();
		model.setPuzzle();
		TrianglePuzzleApp app = new TrianglePuzzleApp(model);
		MouseHandler mh = new MouseHandler(model, app);
		model.setHasWon(false);
		model.puzzle.nodeList.get(0).setIsSelected(true);
		MouseEvent click = new MouseEvent(app, MouseEvent.MOUSE_CLICKED, System.currentTimeMillis(), 211, 10, 10, 1, false);
		mh.mousePressed(click);
		app.setVisible(true);
	}
	
	@Test
	void testProcessThree() {
		Model model = new Model();
		model.setPuzzle();
		TrianglePuzzleApp app = new TrianglePuzzleApp(model);
		MouseHandler mh = new MouseHandler(model, app);
		model.setHasWon(false);
		model.puzzle.nodeList.get(1).setIsSelected(true);
		MouseEvent click = new MouseEvent(app, MouseEvent.MOUSE_CLICKED, System.currentTimeMillis(), 210, 20, 10, 1, false);
		mh.mousePressed(click);
		app.setVisible(true);
	}

}