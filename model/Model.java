package starting.model;

public class Model {
	
	public TrianglePuzzle puzzle;
	public int score;
	public int moves;
	
	public Model() {
		puzzle = new TrianglePuzzle();
//		score = 0;
//		moves = 0;
	}
	
	public TrianglePuzzle getPuzzle() { return puzzle; }
	
	public void setPuzzle() {
		this.puzzle = new TrianglePuzzle();
	}
	
//	public void setScore(int score) {
//		this.score = score;
//	}
//	
//	public int getScore() {
//		return this.score;
//	}
//	
//	public void setMoves(int moves) {
//		this.moves = moves;
//	}
//	
//	public int getMoves() {
//		return this.moves;
//	}
	
}
