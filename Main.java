package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Load FXML and cast to AnchorPane (or whatever your root layout is)
       Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        root.setStyle("-fx-background-color: #515151;");
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        stage.setResizable(false);
        Image icon = new Image(getClass().getResourceAsStream("/logo.png"));
        Image profile = new Image(getClass().getResourceAsStream("/profile.png"));
        ImageView imageView = new ImageView(profile);
        imageView.setX(375);
        imageView.setY(100);
        stage.getIcons().add(icon);
        stage.setTitle("GAMES STORE");
        
        
        
        stage.setScene(scene);
        stage.show();
    }
}
