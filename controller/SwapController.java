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
					int moves = model.puzzle.getMoves();
					model.puzzle.setMoves(moves + 1);
					int score = model.puzzle.getScore();
					model.puzzle.setScore(score - 1);
					UnselectAllController unselectAllController = new UnselectAllController(model, app);
					unselectAllController.process();
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
							int moves = model.puzzle.getMoves();
							model.puzzle.setMoves(moves + 1);
							int score = model.puzzle.getScore();
							model.puzzle.setScore(score - 1);
							UnselectAllController unselectAllController = new UnselectAllController(model, app);
							unselectAllController.process();
							break;
						}
						else if(q == 5) {
							Color tempOne = edgesSelected.get(k).getColor();
							Color tempTwo = edgesSelected.get(k+1).getColor();
							Color tempThree = edgesSelected.get(k+2).getColor();
							edgesSelected.get(k).setColor(tempThree);
							edgesSelected.get(k+1).setColor(tempOne);
							edgesSelected.get(k+2).setColor(tempTwo);
							int moves = model.puzzle.getMoves();
							model.puzzle.setMoves(moves + 1);
							int score = model.puzzle.getScore();
							model.puzzle.setScore(score - 1);
							UnselectAllController unselectAllController = new UnselectAllController(model, app);
							unselectAllController.process();
						}
					}
				}
			}
		}
		for(int z = 0; z < model.puzzle.triangleList.size(); z++) {
			if(model.puzzle.triangleList.get(z).getEdgeLeft().getColor() == model.puzzle.triangleList.get(z).getEdgeRight().getColor()
					&& model.puzzle.triangleList.get(z).getEdgeLeft().getColor() == model.puzzle.triangleList.get(z).getEdgeBottom().getColor()) {
				if(model.puzzle.triangleList.get(z).getIsSelected() != true) {
					model.puzzle.triangleList.get(z).setIsSelected(true);
					if(model.puzzle.triangleList.get(z).getIsBonusAdded() == false) {
						model.puzzle.setScore(model.puzzle.getScore() + 10);
						model.puzzle.triangleList.get(z).setIsBonusAdded(true);
					}
				}
				else if(model.puzzle.triangleList.get(z).getIsSelected() == true) {
					if(model.puzzle.triangleList.get(z).getIsBonusAdded() != true) {
						model.puzzle.triangleList.get(z).setIsBonusAdded(true);
						model.puzzle.setScore(model.puzzle.getScore() + 10);
					}
				}
			}
			else if(model.puzzle.triangleList.get(z).getIsSelected() == true) {
				model.puzzle.triangleList.get(z).setIsSelected(false);
				if(model.puzzle.triangleList.get(z).getIsBonusAdded() == true) {
					model.puzzle.triangleList.get(z).setIsBonusAdded(false);
					model.puzzle.setScore(model.puzzle.getScore() - 10);
				}
			}
		}
		int numTrianglesCompleted = 0;
		for(int q = 0; q < model.puzzle.triangleList.size(); q++) {
			if(q == 0 || q == 4) {
				if(model.puzzle.triangleList.get(q).getEdgeLeft().getColor() == Color.red
						&& model.puzzle.triangleList.get(q).getEdgeRight().getColor() == Color.red
						&& model.puzzle.triangleList.get(q).getEdgeBottom().getColor() == Color.red) {
					numTrianglesCompleted++;
				}
			}
				else if(q == 1 || q == 5) {
					if(model.puzzle.triangleList.get(q).getEdgeLeft().getColor() == Color.blue
							&& model.puzzle.triangleList.get(q).getEdgeRight().getColor() == Color.blue
							&& model.puzzle.triangleList.get(q).getEdgeBottom().getColor() == Color.blue) {
						numTrianglesCompleted++;
					}
				}
				else if(q == 2 || q == 3) {
					if(model.puzzle.triangleList.get(q).getEdgeLeft().getColor() == Color.green
							&& model.puzzle.triangleList.get(q).getEdgeRight().getColor() == Color.green
							&& model.puzzle.triangleList.get(q).getEdgeBottom().getColor() == Color.green) {
						numTrianglesCompleted++;
					}
				}
		}
		if(numTrianglesCompleted == 6) {
			System.out.println("Congrats! You won!");
			model.setHasWon(true);
			app.popupVictoryPanel();
		}
		app.getPanel().repaint();
	}

}
