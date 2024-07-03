package com.example.javafxcssdemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class CSSDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        VBox root = new VBox(10);
        root.setPadding(new Insets(20));

        Label label = new Label("Styled with CSS");
        Button button = new Button("Click me");

        root.getChildren().addAll(label, button);

        Scene scene = new Scene(root, 600, 500);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        stage.setTitle("CSS Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
