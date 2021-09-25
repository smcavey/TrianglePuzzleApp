package starting;

import starting.model.Model;
import starting.view.TrianglePuzzleApp;

public class Main {
	public static void main(String[] args) {
		
		Model model = new Model();
		
		TrianglePuzzleApp tpa = new TrianglePuzzleApp(model);
		tpa.setVisible(true);
	}
}
