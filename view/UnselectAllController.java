package starting.view;

import starting.model.Edge;
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
			for(int j = 0; j < model.puzzle.edgeList.size(); j++) {
				model.puzzle.edgeList.get(j).setIsSelected(false);
			}
		}
		app.getPanel().validate();
		app.getPanel().repaint();
		
	}

}
