package testcontroller;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
import model.Model;
import view.TrianglePuzzleApp;
import TestModel.TestModel;
import controller.UnselectAllController;

public class TestAppCase extends TestCase{
	
	TrianglePuzzleApp app;
	Model model;
	
	protected void setup() {
		Model model = new Model();
		model.setPuzzle();
		TrianglePuzzleApp app = new TrianglePuzzleApp(model);
		app.setVisible(true);
	}
	
	protected void tearDown() {
		app.setVisible(false);
	}
	
	public void testExecute() {
		Thread thread = new Thread() {
			public void run() {
				new UnselectAllController(model, app).process();
			}
		};
		thread.start();
	}

}
