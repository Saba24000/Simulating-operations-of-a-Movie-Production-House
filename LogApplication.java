package cse213.group44movieproductionhousee.homaira;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LogApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
            Scene scene = new Scene(loader.load());

            primaryStage.setTitle("Movie Production House Login");
            primaryStage.setScene(scene);
            primaryStage.setResizable(false); // optional
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
