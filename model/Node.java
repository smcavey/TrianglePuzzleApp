package starting.model;

public class Node {
	
	public int xCoord;
	public int yCoord;
	public int width;
	public int height;
	
	public Node(int xCoord, int yCoord, int width, int height) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.width = width;
		this.height = height;
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

}
