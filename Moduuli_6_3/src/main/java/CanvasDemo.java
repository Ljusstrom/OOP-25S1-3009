import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CanvasDemo extends Application {
    private double x, y;

    @Override
    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(200, 200);
        Button btn = new Button("Tyhjennä");

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.RED);
        gc.fillOval(10, 10, 30, 30);

        gc.moveTo(0, 0);
        gc.lineTo(20, 20);
        gc.stroke();        // this is needed to actually draw the line

        FlowPane layout = new FlowPane();
        layout.getChildren().add(canvas);
        layout.getChildren().add(btn);
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();

        scene.setOnKeyPressed(event -> {
            KeyCode keyCode = event.getCode();
            System.out.println("Key pressed: " + keyCode);
        });

        canvas.setOnMouseClicked(event -> {
            gc.fillOval(event.getX(), event.getY(), 30, 30);
        });

        btn.setOnAction(actionEvent -> {
            gc.clearRect(0, 0, 200, 200);
        });
    }
}


