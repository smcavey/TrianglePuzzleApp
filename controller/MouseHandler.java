package starting.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import starting.model.Model;
import starting.model.Node;
import starting.view.TrianglePuzzleApp;

public class MouseHandler extends MouseAdapter {

	TrianglePuzzleApp app;
	Model model;
	
	public MouseHandler(Model m, TrianglePuzzleApp app) {
		this.model = m;
		this.app = app;
	}
	
	@Override
    public void mousePressed(MouseEvent e) {
		System.out.println(e.getPoint());
		int i = 0;
		for(Node nodes : model.puzzle.nodeList) {
			if(e.getPoint().x >= nodes.getXCoord() && e.getPoint().x <= (nodes.getXCoord() + 20) && e.getPoint().y >= nodes.getYCoord() && e.getPoint().y <= (nodes.getYCoord() + 20)) {
				if(model.puzzle.nodeList.get(i).getIsSelected() == true) {
					model.puzzle.nodeList.get(i).setIsSelected(false);
				}
				else {
					model.puzzle.nodeList.get(i).setIsSelected(true);
				}
				app.getPanel().repaint();
			}
			i++;
		}
	}
	
}
