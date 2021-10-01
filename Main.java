import model.Model;
import view.TrianglePuzzleApp;

public class Main {
	public static void main(String[] args) {
		
		Model model = new Model();
		
		TrianglePuzzleApp tpa = new TrianglePuzzleApp(model);
		tpa.setVisible(true);
	}
}
