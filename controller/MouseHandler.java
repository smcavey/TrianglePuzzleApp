package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import model.Edge;
import model.Model;
import model.Node;
import view.TrianglePuzzleApp;

public class MouseHandler extends MouseAdapter {

	TrianglePuzzleApp app;
	Model model;
	
	public MouseHandler(Model m, TrianglePuzzleApp app) {
		this.model = m;
		this.app = app;
	}
	
	@Override
    public void mousePressed(MouseEvent e) {
		if(model.getHasWon() == true) {
			return;
		}
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
			}
			i++;
		}
		int j = 0;
		for(Edge edges : model.puzzle.edgeList) {
			if(model.puzzle.edgeList.get(j).getThatNode().getIsSelected() == true && model.puzzle.edgeList.get(j).getThisNode().getIsSelected() == true) {
				model.puzzle.edgeList.get(j).setIsSelected(true);
			}
			else {
				model.puzzle.edgeList.get(j).setIsSelected(false);
			}
			j++;
		}
		for(int k = 0; k < model.puzzle.triangleList.size(); k++) {
			if(model.puzzle.triangleList.get(k).getEdgeLeft().getIsSelected() == true
					&& model.puzzle.triangleList.get(k).getEdgeRight().getIsSelected() == true
					&& model.puzzle.triangleList.get(k).getEdgeBottom().getIsSelected() == true) {
				model.puzzle.triangleList.get(k).setIsSelected(true);
			}
			else {
				model.puzzle.triangleList.get(k).setIsSelected(false);
			}
		}
		app.getPanel().validate();
		app.getPanel().repaint();
	}
	
}
