package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(Controller.class.getResource("sample.fxml"));
        primaryStage.setTitle("Визначення оптимальної кількості засобів протипожежного захисту складських приміщень");
        primaryStage.setScene(new Scene(fxmlLoader.load(), 1330, 800));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);
    }
}
