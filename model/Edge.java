package starting.model;

import java.awt.Color;

public class Edge {
	
	public String ID;
	public Node thisNode;
	public Node thatNode;
	public int xOneCoord;
	public int xTwoCoord;
	public int yOneCoord;
	public int yTwoCoord;
	public Color color;
	public boolean isSelected;
	
	public Edge(String ID, Node thisNode, Node thatNode, int xOneCoord, int xTwoCoord, int yOneCoord, int yTwoCoord, Color color, boolean isSelected) {
		this.ID = ID;
		this.thisNode = thisNode;
		this.thatNode = thatNode;
		this.xOneCoord = xOneCoord;
		this.xTwoCoord = xTwoCoord;
		this.yOneCoord = yOneCoord;
		this.yTwoCoord = yTwoCoord;
		this.color = color;
		this.isSelected = isSelected;
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
	
	public int getXOneCoord() {
		return this.xOneCoord;
	}
	
	public int getXTwoCoord() {
		return this.xTwoCoord;
	}
	
	public int getYOneCoord() {
		return this.yOneCoord;
	}
	
	public int getYTwoCoord() {
		return this.yTwoCoord;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void setIsSelected(boolean selection) {
		this.isSelected = selection;
	}
	
	public boolean getIsSelected() {
		return this.isSelected;
	}

}
