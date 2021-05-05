package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        // creating the square
        Rectangle square = new Rectangle();
        square.setX(125);
        square.setY(80);
        square.setWidth(150);
        square.setHeight(150);
        square.setFill(Color.rgb(248,11,11));

        // creating label to show size of square
        Label size = new Label();
        size.setText("150 X 150");
        size.setTextFill(Color.rgb(3,3,3));
        size.setFont(Font.font("Verdana", FontWeight.BOLD, 18));

        // creating the toggle button
        Button btn = new Button("Click to toggle square size");
        btn.setMaxSize(800,1000);
        btn.setLayoutX(100);
        btn.setLayoutY(250);
        btn.setStyle("-fx-font: 15 arial; -fx-base: #006308; -fx-text-fill: #ffffff");

        // setting the mouse click action
        btn.setOnMouseClicked(event -> {
            // left click of mouse
            if(event.getButton()== MouseButton.PRIMARY){
                // shrinking the size of square
                square.setHeight(100);
                square.setWidth(100);
                size.setText("100 X 100");
            }
            // right click of mouse
            else if(event.getButton()==MouseButton.SECONDARY){
                // enlarging the square again
                square.setHeight(150);
                square.setWidth(150);
                size.setText("150 X 150");
            }
        });

        // adding all items to root
        Group root = new Group(square, size, btn);
        Scene scene = new Scene(root, 400, 400, Color.rgb(124, 234, 213));
        stage.setTitle("Square size toggle");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
