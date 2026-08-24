import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * A GUI for Swell using FXML.
 */
public class Main extends Application {
    private Swell swell = new Swell();

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane root = fxmlLoader.load();
            Scene scene = new Scene(root);

            stage.setTitle("Swell");
            // stage.setResizable(false);
            stage.setMinHeight(600.0);
            stage.setMinWidth(400.0);
            stage.setScene(scene);
            fxmlLoader.<MainWindow>getController().setSwell(swell);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
