import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
 
public class App extends Application {

    @Override
    public void start(Stage primaryStage) {

        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("MainScene.fxml"));
            Pane ventana = (Pane)loader.load();

            Scene scene = new Scene(ventana);
            primaryStage.setTitle("Calculadora de edad");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }/*
    public void start(Stage primaryStage) {

        Parent root;
        try {

            root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("Hello World!");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {

        }
    }*/
 
 public static void main(String[] args) {
        launch(args);

    }
}