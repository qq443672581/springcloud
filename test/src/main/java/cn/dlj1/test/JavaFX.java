package cn.dlj1.test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class JavaFX extends Application {

    @Override
    public void start(Stage stage) {

        final Label message = new Label("666");
        message.setFont(new Font(100));
        stage.setScene(new Scene(message));

        Button button = new Button("Red");
        stage.setScene(new Scene(button));


        stage.setTitle("Hello");
        stage.show();


    }

//    public static void main(String[] args){}

}
