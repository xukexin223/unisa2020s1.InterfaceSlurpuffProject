package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class AppController {
    protected String templatePath = null;
    protected Parent root;

    /**
     * Loads a stylesheet into this scene
     * @param sheetPath Path of the stylesheet, relative to the project root
     */
    public void loadStylesheet(String sheetPath) {
        assert root != null;
        root.getStylesheets().add(sheetPath);
    }

    /**
     * Load this controller and it's template scene
     */
    public void load() {
        assert templatePath != null;
        FXMLLoader loader = new FXMLLoader(getClass().getResource(templatePath));
        root = null;

        try {
            root = loader.load();
        } catch (IOException e) {
            SimpleDialog.Error(e);
        }

        assert root != null;
        Scene scene = new Scene(root);
        Main.get_MainStage().setScene(scene);
        Main.get_MainStage().show();
    }
}
