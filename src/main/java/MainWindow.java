import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * Controller for the main GUI.
 */
public class MainWindow extends AnchorPane {
    @FXML
    private ScrollPane scrollPane;
    @FXML
    private VBox dialogContainer;
    @FXML
    private TextField userInput;
    @FXML
    private Button sendButton;

    private Swell swell;

    private Image userImage = new Image(this.getClass().getResourceAsStream("/images/Moon.png"));
    private Image swellImage = new Image(this.getClass().getResourceAsStream("/images/Star.png"));

    @FXML
    public void initialize() {
        scrollPane.vvalueProperty().bind(dialogContainer.heightProperty());
    }

    /**
     * Injects the Swell instance.
     */
    public void setSwell(Swell swell) {
        this.swell = swell;
    }

    /**
     * Creates two dialog boxes, one echoing user input and the other containing Swell's reply, and
     * then appends them to the dialog container. Clears the user input after processing.
     */
    @FXML
    private void handleUserInput() {
        String input = userInput.getText();
        String response = swell.getResponse(input);
        String responseType = swell.getResponseType();
        dialogContainer.getChildren().addAll(
                DialogBox.getUserDialog(input, userImage),
                DialogBox.getSwellDialog(response, swellImage, responseType)
        );
        userInput.clear();
    }
}
