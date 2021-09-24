package starting.model;

public class Model {
	TrianglePuzzle puzzle;
	
	public Model() {
		puzzle = new TrianglePuzzle();
	}
	
	public TrianglePuzzle getPuzzle() { return puzzle; }
	
	public void setPuzzle() {
		this.puzzle = new TrianglePuzzle();
	}
	
	
}
