import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class PlatformRunLaterDemo extends Application {
    private int counter = 0;
    private Button button;

    @Override
    public void start(Stage stage) {
        Image img = new Image("/kuva.jpg");
        Canvas canvas = new Canvas(100, 100);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        button = new Button("0");
        BackgroundComputation computation = new BackgroundComputation(this);
        button.setOnAction(event -> computation.startComputation());

        VBox root = new VBox();
        root.getChildren().add(button);
        root.getChildren().add(canvas);

        gc.drawImage(img, 0, 0, 80, 80);

        Scene scene = new Scene(root, 300, 250);
        stage.setScene(scene);
        stage.show();
    }

    public synchronized void updateButtonText() {
        counter++;
        String counterText = Integer.toString(counter);
        button.setText(counterText);
    }

}