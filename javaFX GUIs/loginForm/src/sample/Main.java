package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label uname = new Label("Enter username: ");
        uname.setTextFill(Color.rgb(3,3,252));
        uname.setFont(Font.font("Verdana", FontWeight.BOLD, 14));
        TextField tf1 = new TextField();

        Label pswd = new Label("Enter password: ");
        pswd.setTextFill(Color.rgb(3,3,252));
        pswd.setFont(Font.font("Verdana", FontWeight.BOLD, 14));
        TextField tf2 = new TextField();

        Button login = new Button("Login");
        login.setMaxSize(70,120);
        login.setStyle("-fx-font: 15 arial; -fx-base: #006308; -fx-text-fill: #ffffff;");
        Button cancel = new Button("Cancel");
        cancel.setMaxSize(70,120);
        cancel.setStyle("-fx-font: 15 arial; -fx-base: #a10808; -fx-text-fill: #ffffff;");

        Label res = new Label();
        res.setFont(Font.font("Verdana", FontWeight.BOLD, 14));

        GridPane root = new GridPane();
        root.setStyle("-fx-base: #91e699");
        root.setHgap(0);
        root.setVgap(15);
        root.addRow(0, uname, tf1);
        root.addRow(1, pswd, tf2);
        root.addRow(2, login, cancel);
        root.addRow(3, res);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 400, 350);
        primaryStage.setTitle("Login Form");
        primaryStage.setScene(scene);
        primaryStage.show();

        login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String username = tf1.getText();
                String password = tf2.getText();
                String defuname = "administrator";
                String defpswd = "root";
                if(username.compareTo(defuname)==0 && password.compareTo(defpswd)==0) {
                    res.setText("Login Successful!");
                    res.setTextFill(Color.GREEN);
                }
                else {
                    res.setText("OOPS, Invalid User \n ID or Password!");
                    res.setTextFill(Color.RED);
                }
            }
        });

        cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
