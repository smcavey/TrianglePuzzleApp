package starting.view;

import starting.model.Model;
import starting.view.TrianglePuzzleApp;

public class UnselectAllController {
	
	TrianglePuzzleApp app;
	Model model;
	
	public UnselectAllController(Model m, TrianglePuzzleApp app) {
		this.model = model;
		this.app = app;
	}
	
	public void process() {
		System.out.println("You clicked Unselect All!");
	}

}
