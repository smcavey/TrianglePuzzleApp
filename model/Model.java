package model;

public class Model {
	
	public TrianglePuzzle puzzle;
	public boolean hasWon;
	
	public Model() {
		puzzle = new TrianglePuzzle();
	}
	
	public TrianglePuzzle getPuzzle() { return puzzle; }
	
	public void setPuzzle() {
		this.puzzle = new TrianglePuzzle();
	}
	
	public void setHasWon(boolean hasWon) {
		this.hasWon = hasWon;
	}
	
	public boolean getHasWon() {
		return this.hasWon;
	}
	
}
