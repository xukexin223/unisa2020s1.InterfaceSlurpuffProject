package application.Security;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Security mainWindow1 = new Security();

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
