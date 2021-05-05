package sample;

// importing all required classes
import javafx.application.Application;
import javafx.scene.shape.Line;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.shape.Polygon;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // title of the GUI window
        stage.setTitle("KITE");

        // creating main body of the kite
        // I used polygon shape to create body
        double[] points1 = {
                200.0, 40.0,
                280.0, 120.0,
                200.0, 280.0,
                120.0, 120.0,
        };
        Polygon body = new Polygon(points1);
        // formatting the body styles
        body.setFill(Color.rgb(236, 215, 101));
        body.setStroke(Color.rgb(240, 14, 14));
        body.setStrokeWidth(1.5);

        // using polygon shape for creating tail of the kite
        double[] points2 = {
                200.0, 280.0,
                240.0, 340.0,
                160.0, 340.0,
        };
        Polygon tail = new Polygon(points2);
        tail.setFill(Color.rgb(236, 32, 32));
        tail.setStroke(Color.rgb(255, 255, 102));
        tail.setStrokeWidth(1.5);

        // creating three lines for kite using the line shape
        Line line1 = new Line();
        line1.setStartX(120.0);
        line1.setStartY(120.0);
        line1.setEndX(280.0);
        line1.setEndY(120.0);
        line1.setFill(Color.rgb(2, 47, 2));
        line1.setStrokeWidth(1.8);

        Line line2 = new Line();
        line2.setStartX(200.0);
        line2.setStartY(40.0);
        line2.setEndX(200.0);
        line2.setEndY(280.0);
        line2.setStrokeWidth(1.8);

        Line line3 = new Line();
        line3.setStartX(200.0);
        line3.setStartY(120.0);
        line3.setEndX(0.0);
        line3.setEndY(400.0);
        line3.setStrokeWidth(1.8);

        // grouping all the shapes and adding them to root
        Group root = new Group(body, tail, line1, line2, line3);

        // creating scene of desired size and color
        Scene scene = new Scene(root, 400, 400, Color.rgb(124, 234, 213));

        // showing the scene and stage
        stage.setScene(scene);
        stage.show();
    }

    // launching the GUI window
    public static void main(String[] args) {
        launch(args);
    }
}
