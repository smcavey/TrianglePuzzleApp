package starting.controller;

import starting.model.Model;
import starting.view.TrianglePuzzleApp;

public class SwapController {
	
	TrianglePuzzleApp app;
	Model model;
	
	public SwapController(Model m, TrianglePuzzleApp app) {
		this.model = m;
		this.app = app;
	}
	
	public void process() {
		System.out.println("You clicked Swap Edges!");
	}

}
