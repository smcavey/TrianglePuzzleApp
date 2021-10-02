package testcontroller;
import java.awt.Color;

import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
import model.Model;
import view.TrianglePuzzleApp;
import TestModel.TestModel;
import controller.SwapController;

public class TestSwapController extends TestCase{
	
	TrianglePuzzleApp app;
	Model model;
	SwapController sc;
	
	@Test
	void testProcessOne() {
		Model model = new Model();
		model.setPuzzle();
		TrianglePuzzleApp app = new TrianglePuzzleApp(model);
		SwapController sc = new SwapController(model, app);
		sc.process();
		app.setVisible(true);
	}
	
	@Test
	void testProcessTwo() {
		Model model = new Model();
		model.setPuzzle();
		model.puzzle.edgeList.get(0).setIsSelected(true);
		model.puzzle.edgeList.get(1).setIsSelected(true);
		model.puzzle.edgeList.get(2).setIsSelected(true);
		TrianglePuzzleApp app = new TrianglePuzzleApp(model);
		SwapController sc = new SwapController(model, app);
		sc.process();
		app.setVisible(true);
	}
	
	@Test
	void testProcessThree() {
		Model model = new Model();
		model.setPuzzle();
		model.puzzle.edgeList.get(0).setIsSelected(true);
		model.puzzle.edgeList.get(1).setIsSelected(true);
		model.puzzle.edgeList.get(3).setIsSelected(true);
		TrianglePuzzleApp app = new TrianglePuzzleApp(model);
		SwapController sc = new SwapController(model, app);
		sc.process();
		app.setVisible(true);
	}
	
	@Test
	void testProcessFour() {
		Model model = new Model();
		model.setPuzzle();
		model.puzzle.triangleList.get(0).getEdgeLeft().setColor(Color.red);
		model.puzzle.triangleList.get(0).getEdgeRight().setColor(Color.red);
		model.puzzle.triangleList.get(0).getEdgeBottom().setColor(Color.red);
		model.puzzle.triangleList.get(4).getEdgeLeft().setColor(Color.red);
		model.puzzle.triangleList.get(4).getEdgeRight().setColor(Color.red);
		model.puzzle.triangleList.get(4).getEdgeBottom().setColor(Color.red);
		TrianglePuzzleApp app = new TrianglePuzzleApp(model);
		SwapController sc = new SwapController(model, app);
		sc.process();
		app.setVisible(true);
	}
	
	@Test
	void testProcessFive() {
		Model model = new Model();
		model.setPuzzle();
		model.puzzle.triangleList.get(0).getEdgeLeft().setColor(Color.red);
		model.puzzle.triangleList.get(0).getEdgeRight().setColor(Color.red);
		model.puzzle.triangleList.get(0).getEdgeBottom().setColor(Color.red);
		model.puzzle.triangleList.get(4).getEdgeLeft().setColor(Color.red);
		model.puzzle.triangleList.get(4).getEdgeRight().setColor(Color.red);
		model.puzzle.triangleList.get(4).getEdgeBottom().setColor(Color.red);
		model.puzzle.triangleList.get(1).getEdgeLeft().setColor(Color.blue);
		model.puzzle.triangleList.get(1).getEdgeRight().setColor(Color.blue);
		model.puzzle.triangleList.get(1).getEdgeBottom().setColor(Color.blue);
		model.puzzle.triangleList.get(5).getEdgeLeft().setColor(Color.blue);
		model.puzzle.triangleList.get(5).getEdgeRight().setColor(Color.blue);
		model.puzzle.triangleList.get(5).getEdgeBottom().setColor(Color.blue);
		model.puzzle.triangleList.get(2).getEdgeLeft().setColor(Color.green);
		model.puzzle.triangleList.get(2).getEdgeRight().setColor(Color.green);
		model.puzzle.triangleList.get(2).getEdgeBottom().setColor(Color.green);
		model.puzzle.triangleList.get(3).getEdgeLeft().setColor(Color.green);
		model.puzzle.triangleList.get(3).getEdgeRight().setColor(Color.green);
		model.puzzle.triangleList.get(3).getEdgeBottom().setColor(Color.green);
		TrianglePuzzleApp app = new TrianglePuzzleApp(model);
		SwapController sc = new SwapController(model, app);
		sc.process();
		app.setVisible(true);
	}
	
	@Test
	void testProcessSix() {
		Model model = new Model();
		model.setPuzzle();
		model.puzzle.edgeList.get(2).setIsSelected(true);
		model.puzzle.edgeList.get(4).setIsSelected(true);
		model.puzzle.edgeList.get(6).setIsSelected(true);
		TrianglePuzzleApp app = new TrianglePuzzleApp(model);
		SwapController sc = new SwapController(model, app);
		sc.process();
		app.setVisible(true);
	}

}