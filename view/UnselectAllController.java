package starting.view;

import starting.model.Model;
import starting.model.Node;
import starting.view.TrianglePuzzleApp;

public class UnselectAllController {
	
	TrianglePuzzleApp app;
	Model model;
	
	public UnselectAllController(Model m, TrianglePuzzleApp app) {
		this.model = m;
		this.app = app;
	}
	
	public void process() {
		if(model != null) {
			int i = 0;
			for(Node nodes : model.puzzle.nodeList) {
				if(model.puzzle.nodeList.get(i).getIsSelected() == true) {
					model.puzzle.nodeList.get(i).setIsSelected(false);
				}
				i++;
			}
			app.getPanel().repaint();
		}
		
	}

}
