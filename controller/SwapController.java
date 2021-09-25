package starting.controller;

import java.awt.Color;
import java.util.ArrayList;

import starting.model.Edge;
import starting.model.Model;
import starting.view.TrianglePuzzleApp;

public class SwapController {
	
	TrianglePuzzleApp app;
	Model model;
	ArrayList<Edge> edgesSelected;
	
	public SwapController(Model model, TrianglePuzzleApp app) {
		this.model = model;
		this.app = app;
	}
	
	public void process() {
//		int edgesSelected = 0;
//		for(int i = 0; i < model.puzzle.edgeList.size(); i++) {
//			if(model.puzzle.edgeList.get(i).getIsSelected() == true) {
//				edgesSelected++;
//			}
//		}
//		System.out.println(edgesSelected);
//		if(edgesSelected == 2) {
//			for(int j = 0; j < model.puzzle.edgeList.size(); j++) {
//				for(int k = 0; k < model.puzzle.edgeList.size(); k++) {
//					if(j == k) {
//						continue;
//					}
//					else if(model.puzzle.edgeList.get(j).getThatNode() == model.puzzle.edgeList.get(k).getThatNode()) {
//						Color temp = model.puzzle.edgeList.get(j).getColor();
//						model.puzzle.edgeList.get(j).setColor(model.puzzle.edgeList.get(k).getColor());
//						model.puzzle.edgeList.get(k).setColor(temp);
//					}
//				}
//			}
//		}
		int numEdgesSelected = 0;
		ArrayList<Edge> edgesSelected = new ArrayList<Edge>();
		for(int i = 0; i < model.puzzle.edgeList.size(); i++) {
			if(model.puzzle.edgeList.get(i).getIsSelected() == true) {
				numEdgesSelected++;
				edgesSelected.add(model.puzzle.edgeList.get(i));
			}
		}
		if(numEdgesSelected == 2) {
			for(int j = 0; j < edgesSelected.size()-1; j++) {
				if(edgesSelected.get(j).getThatNode() == edgesSelected.get(j+1).getThatNode() 
						|| edgesSelected.get(j).getThatNode() == edgesSelected.get(j+1).getThisNode() 
						|| edgesSelected.get(j).getThisNode() == edgesSelected.get(j+1).getThatNode() 
						|| edgesSelected.get(j).getThisNode() == edgesSelected.get(j+1).getThisNode()) {
					Color temp = edgesSelected.get(j).getColor();
					edgesSelected.get(j).setColor(edgesSelected.get(j+1).getColor());
					edgesSelected.get(j+1).setColor(temp);
				}
			}
		}
		if(numEdgesSelected == 3) {
			for(int k = 0; k < edgesSelected.size()-2; k++) {
				if((edgesSelected.get(k).getThatNode() == edgesSelected.get(k+1).getThatNode() 
						|| edgesSelected.get(k).getThatNode() == edgesSelected.get(k+1).getThisNode() 
						|| edgesSelected.get(k).getThisNode() == edgesSelected.get(k+1).getThatNode() 
						|| edgesSelected.get(k).getThisNode() == edgesSelected.get(k+1).getThisNode())
						&&
						(edgesSelected.get(k).getThatNode() == edgesSelected.get(k+2).getThatNode() 
						|| edgesSelected.get(k).getThatNode() == edgesSelected.get(k+2).getThisNode() 
						|| edgesSelected.get(k).getThisNode() == edgesSelected.get(k+2).getThatNode() 
						|| edgesSelected.get(k).getThisNode() == edgesSelected.get(k+2).getThisNode())
						&&
						(edgesSelected.get(k+1).getThatNode() == edgesSelected.get(k+2).getThatNode() 
						|| edgesSelected.get(k+1).getThatNode() == edgesSelected.get(k+2).getThisNode() 
						|| edgesSelected.get(k+1).getThisNode() == edgesSelected.get(k+2).getThatNode() 
						|| edgesSelected.get(k+1).getThisNode() == edgesSelected.get(k+2).getThisNode())) {
					for(int q = 0; q < model.puzzle.triangleList.size(); q++) {
						if(model.puzzle.triangleList.get(q).getIsSelected() == true) {
							Color tempOne = edgesSelected.get(k).getColor();
							Color tempTwo = edgesSelected.get(k+1).getColor();
							Color tempThree = edgesSelected.get(k+2).getColor();
							edgesSelected.get(k).setColor(tempTwo);
							edgesSelected.get(k+1).setColor(tempThree);
							edgesSelected.get(k+2).setColor(tempOne);
							break;
						}
						else if(q == 5) {
							Color tempOne = edgesSelected.get(k).getColor();
							Color tempTwo = edgesSelected.get(k+1).getColor();
							Color tempThree = edgesSelected.get(k+2).getColor();
							edgesSelected.get(k).setColor(tempThree);
							edgesSelected.get(k+1).setColor(tempOne);
							edgesSelected.get(k+2).setColor(tempTwo);
						}
					}
//					Color tempOne = edgesSelected.get(k).getColor();
//					Color tempTwo = edgesSelected.get(k+1).getColor();
//					Color tempThree = edgesSelected.get(k+2).getColor();
//					edgesSelected.get(k).setColor(tempThree);
//					edgesSelected.get(k+1).setColor(tempOne);
//					edgesSelected.get(k+2).setColor(tempTwo);
				}
			}
		}
		int numCompletedTriangles = 0;
		for(int z = 0; z < model.puzzle.triangleList.size(); z++) {
			if(model.puzzle.triangleList.get(z).getEdgeLeft().getColor() == model.puzzle.triangleList.get(z).getEdgeRight().getColor()
					&& model.puzzle.triangleList.get(z).getEdgeLeft().getColor() == model.puzzle.triangleList.get(z).getEdgeBottom().getColor()) {
				model.puzzle.triangleList.get(z).setIsSelected(true);
				System.out.println("Triangle " + model.puzzle.triangleList.get(z).getID() + " is complete");
				numCompletedTriangles++;
			}
			else {
				model.puzzle.triangleList.get(z).setIsSelected(false);
			}
		}
		if(numCompletedTriangles == 6) {
			System.out.println("Congrats! You won!");
		}
		model.puzzle.setMoves(model.puzzle.getMoves() + 1);
		app.getPanel().validate();
		app.getPanel().repaint();
	}

}
