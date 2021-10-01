package controller;

import model.Model;
import model.TrianglePuzzle;
import view.TrianglePuzzleApp;

public class ResetController {

	TrianglePuzzleApp app;
	Model model;
	
	public ResetController(Model m, TrianglePuzzleApp app) {
		this.model = m;
		this.app = app;
	}
	
	public void process() {
		model.setHasWon(false);
		model.puzzle = new TrianglePuzzle();
		model.puzzle.setMoves(0);
		model.puzzle.setScore(0);
		app.getPanel().repaint();
	}
}
