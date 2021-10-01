package model;

public class Node {
	
	public int xCoord;
	public int yCoord;
	public int width;
	public int height;
	public boolean isSelected;
	
	public Node(int xCoord, int yCoord, int width, int height, boolean isSelected) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.width = width;
		this.height = height;
		this.isSelected = isSelected;
	}
	
	public int getXCoord() {
		return this.xCoord;
	}
	
	public int getYCoord() {
		return this.yCoord;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public boolean getIsSelected() {
		return this.isSelected;
	}
	
	public void setIsSelected(boolean selection) {
		this.isSelected = selection;
	}

}
