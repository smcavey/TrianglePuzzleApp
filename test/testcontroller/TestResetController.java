package testcontroller;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
import model.Model;
import view.TrianglePuzzleApp;
import TestModel.TestModel;
import controller.ResetController;

public class TestResetController extends TestCase{
	
	TrianglePuzzleApp app;
	Model model;
	ResetController rc;
	
	@Test
	void testProcess() {
		Model model = new Model();
		model.setPuzzle();
		TrianglePuzzleApp app = new TrianglePuzzleApp(model);
		ResetController rc = new ResetController(model, app);
		rc.process();
		app.setVisible(true);
	}

}