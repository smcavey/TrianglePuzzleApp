package testcontroller;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
import model.Model;
import view.TrianglePuzzleApp;
import TestModel.TestModel;
import controller.UnselectAllController;

public class TestUnselectAllController extends TestCase{
	
	TrianglePuzzleApp app;
	Model model;
	UnselectAllController uac;
	
	@Test
	void testProcess() {
		Model model = new Model();
		model.setPuzzle();
		TrianglePuzzleApp app = new TrianglePuzzleApp(model);
		UnselectAllController uac = new UnselectAllController(model, app);
		uac.process();
		app.setVisible(true);
	}

}