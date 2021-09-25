package starting.model;

public class Triangle {
	
	public int ID;
	public Edge edgeRight;
	public Edge edgeLeft;
	public Edge edgeBottom;
	public boolean isSolid;
	
	public Triangle(int ID, Edge edgeLeft, Edge edgeRight, Edge edgeBottom, boolean isSolid) {
		this.ID = ID;
		this.edgeLeft = edgeLeft;
		this.edgeRight = edgeRight;
		this.edgeBottom = edgeBottom;
		this.isSolid = isSolid;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public Edge getEdgeLeft() {
		return this.edgeLeft;
	}
	
	public Edge getEdgeRight() {
		return this.edgeRight;
	}
	
	public Edge getEdgeBottom() {
		return this.edgeBottom;
	}
	
	public void setIsSolid(boolean solid) {
		this.isSolid = solid;
	}
	
	public boolean getIsSolid() {
		return this.isSolid;
	}

}
