import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;

public class DialogBox extends HBox {
    private Label text;
    private ImageView displayPicture;

    public DialogBox(String s, Image i) {
        text = new Label(s);
        displayPicture = new ImageView(i);

        text.setWrapText(true);
        displayPicture.setFitWidth(100.0);
        displayPicture.setFitHeight(100.0);
        displayPicture.setPreserveRatio(true);
        double sideLength = Math.min(i.getWidth(), i.getHeight());
        displayPicture.setViewport(new Rectangle2D(
                (i.getWidth() - sideLength) / 2,
                (i.getHeight() - sideLength) / 2,
                sideLength,
                sideLength));
        displayPicture.setClip(new Circle(50.0, 50.0, 50.0));
        this.setAlignment(Pos.TOP_RIGHT);

        this.getChildren().addAll(text, displayPicture);
    }
}
