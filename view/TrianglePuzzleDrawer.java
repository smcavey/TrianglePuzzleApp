package view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

import model.Edge;
import model.Model;
import model.Node;

public class TrianglePuzzleDrawer extends JPanel {

	Model model;
	
	/**
	 * Create the panel.
	 */
	public TrianglePuzzleDrawer(Model model) {
		this.model = model;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// protects you when looking inside WindowBuilder
		if (model == null) { return; }
		
		// do the math and figure out WHERE to draw all the boxes (nodes) lines (edges)
		
		// DRAW ENTIRE PUZZLE HERE...
		for(Node nodes : model.puzzle.nodeList) {
			g.drawRect(nodes.getXCoord(), nodes.getYCoord(), nodes.getWidth(), nodes.getHeight());
			if(nodes.getIsSelected() == false) {
				g.setColor(Color.LIGHT_GRAY);
			}
			else {
				g.setColor(Color.CYAN);
			}
			g.fillRect(nodes.getXCoord(), nodes.getYCoord(), nodes.getWidth(), nodes.getHeight());
		}
		for(Edge edges : model.puzzle.edgeList) {
			g.setColor(edges.getColor());
			g.drawLine(edges.getXOneCoord(), edges.getYOneCoord(), edges.getXTwoCoord(), edges.getYTwoCoord());
		}
		g.setColor(Color.BLACK);
		g.drawString("Score: " + String.valueOf(model.puzzle.getScore()), 300, 25);
		g.drawString("Moves: " + String.valueOf(model.puzzle.getMoves()), 300, 40);
	}

}
