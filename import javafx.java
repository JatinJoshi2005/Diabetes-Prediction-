import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

// Ensure the class name matches the file name
public class RectangleExample extends Application {

    // Constants for rectangle properties
    private static final double RECT_X = 50;
    private static final double RECT_Y = 50;
    private static final double RECT_WIDTH = 200;
    private static final double RECT_HEIGHT = 100;
    private static final Color RECT_FILL_COLOR = Color.BLUE;
    private static final Color RECT_STROKE_COLOR = Color.BLACK;
    private static final double RECT_STROKE_WIDTH = 2;

    @Override
    public void start(Stage primaryStage) {
        // Create a rectangle with specified properties
        Rectangle rectangle = new Rectangle(RECT_X, RECT_Y, RECT_WIDTH, RECT_HEIGHT);
        rectangle.setFill(RECT_FILL_COLOR); // Set fill color
        rectangle.setStroke(RECT_STROKE_COLOR); // Set border color
        rectangle.setStrokeWidth(RECT_STROKE_WIDTH);

        // Create a pane and add the rectangle
        Pane pane = new Pane();
        pane.getChildren().add(rectangle);

        // Create a scene and set it on the stage
        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setTitle("JavaFX Rectangle Example");
        primaryStage.setScene(scene);

        // Handle window close event (optional)
        primaryStage.setOnCloseRequest(event -> {
            System.out.println("Application is closing...");
        });

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
