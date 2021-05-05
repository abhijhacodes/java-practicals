package sample;

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage pS) throws Exception {
        Label enno = new Label("Enrolment No.: ");
        enno.setTextFill(Color.rgb(3,3,252));
        enno.setFont(Font.font("Verdana", FontWeight.BOLD, 16));
        Label ele1 = new Label("Elective 1:");
        ele1.setTextFill(Color.rgb(3,3,252));
        ele1.setFont(Font.font("Verdana", FontWeight.BOLD, 16));
        Label ele2 = new Label("Elective 2:");
        ele2.setTextFill(Color.rgb(3,3,252));
        ele2.setFont(Font.font("Verdana", FontWeight.BOLD, 16));
        Label res = new Label();

        ComboBox cb1 = new ComboBox();
        cb1.getItems().add("Select Enrolment No");
        cb1.setStyle("-fx-base: #373030FF; -fx-text-fill: #ffffff; -fx-font: 15 arial;");
        cb1.getSelectionModel().selectFirst();
        String en = "1904201070";
        String s;
        for(int i = 1; i <= 83; i++){
            if(i <= 9){
                s = en + '0' + String.valueOf(i);
            }
            else{
                s = en + String.valueOf(i);
            }
            cb1.getItems().add(s);
        }

        ComboBox cb2 = new ComboBox();
        cb2.getItems().add("Select Elective 1");
        cb2.setStyle("-fx-base: #373030FF; -fx-text-fill: #ffffff; -fx-font: 15 arial;");
        cb2.getSelectionModel().selectFirst();
        cb2.getItems().add("Software Engineering");
        cb2.getItems().add("Computer Graphics");

        ComboBox cb3 = new ComboBox();
        cb3.getItems().add("Select Elective 2");
        cb3.setStyle("-fx-base: #373030FF; -fx-text-fill: #ffffff; -fx-font: 15 arial;");
        cb3.getSelectionModel().selectFirst();
        cb3.getItems().add("Python for Data Science");
        cb3.getItems().add("Cyber Security");

        GridPane root = new GridPane();
        Button insert = new Button("Insert");
        insert.setMaxSize(70,120);
        insert.setStyle("-fx-font: 15 arial; -fx-base: #006308; -fx-text-fill: #ffffff;");
        Button cancel = new Button("Cancel");
        cancel.setMaxSize(70,120);
        cancel.setStyle("-fx-font: 15 arial; -fx-base: #a10808; -fx-text-fill: #ffffff;");

        root.setStyle("-fx-base: rgb(150,250,250)");
        root.setVgap(15);
        root.setHgap(7);
        root.addRow(0, enno, cb1);
        root.addRow(1, ele1, cb2);
        root.addRow(2, ele2, cb3);
        root.addRow(3, insert, cancel);
        root.addRow(4, res);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 550, 500);
        pS.setTitle("Elective Choice");
        pS.setScene(scene);
        pS.show();

        insert.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){

                String enrol = (String)cb1.getSelectionModel().getSelectedItem();
                String elective1 = (String)cb2.getSelectionModel().getSelectedItem();
                String elective2 = (String)cb3.getSelectionModel().getSelectedItem();

                if(enrol.compareTo("Select Enrolment No") != 0 && elective1.compareTo("Select Elective") != 0 && elective2.compareTo("Select Elective") != 0) {
                    res.setText("Enrolment No. " +enrol+ "\nselected " +elective1+ "\nand " +elective2+ ".");
                    res.setFont(Font.font("Verdana", FontWeight.BOLD, 14));
                    res.setTextFill(Color.GREEN);
                } else{
                    res.setText("Invalid Selections");
                    res.setFont(Font.font("Verdana", FontWeight.BOLD, 14));
                    res.setTextFill(Color.RED);
                }
            }
        });

        cancel.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event) {
                ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
            }
        });
    }

    public static void main(String[] args) { launch(args); }
}
