package starting.model;

import java.awt.Color;

public class Edge {
	
	public String ID;
	public Node thisNode;
	public Node thatNode;
	public Color color;
	
	public Edge(String ID, Node thisNode, Node thatNode, Color color) {
		this.ID = ID;
		this.thisNode = thisNode;
		this.thatNode = thatNode;
		this.color = color;
	}
	
	public String getID() {
		return this.ID;
	}
	
	public Node getThisNode() {
		return this.thisNode;
	}
	
	public Node getThatNode() {
		return this.thatNode;
	}
	
	public Color getColor() {
		return this.color;
	}

}
