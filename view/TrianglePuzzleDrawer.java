package starting.view;

import java.awt.Graphics;
import javax.swing.JPanel;
import starting.model.Model;

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
		g.drawLine(220, 20, 70, 350);
		g.drawLine(220, 20, 370, 350);
		g.drawRect(210, 10, 20, 20);
	}

}
