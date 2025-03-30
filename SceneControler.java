package application;

import java.io.IOException;
import java.lang.classfile.components.ClassPrinter.Node;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneControler {

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchtoscene1(ActionEvent event) throws IOException {
	    Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
	    stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
	    
	    scene = new Scene(root);
	    scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); // Apply CSS

	    stage.setScene(scene);
	    stage.show();
	}

	public void switchtoscene2(ActionEvent event) throws IOException {
	    Parent root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
	    stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
	    
	    scene = new Scene(root);
	    scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); // Apply CSS

	    stage.setScene(scene);
	    stage.show();
	}
	public void switchtoscene3(ActionEvent event) throws IOException {
	    Parent root = FXMLLoader.load(getClass().getResource("scene3.fxml"));
	    stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
	    
	    scene = new Scene(root);
	    scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); // Apply CSS

	    stage.setScene(scene);
	    stage.show();
	}
	public void switchtoscene4(ActionEvent event) throws IOException {
	    Parent root = FXMLLoader.load(getClass().getResource("scene4.fxml"));
	    stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
	    
	    scene = new Scene(root);
	    scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); // Apply CSS

	    stage.setScene(scene);
	    stage.show();
	}
	public void switchtoscene5(ActionEvent event) throws IOException {
	    Parent root = FXMLLoader.load(getClass().getResource("scene5.fxml"));
	    stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
	    
	    scene = new Scene(root);
	    scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); // Apply CSS

	    stage.setScene(scene);
	    stage.show();
	}
	public void switchtoscene6(ActionEvent event) throws IOException {
	    Parent root = FXMLLoader.load(getClass().getResource("scene6.fxml"));
	    stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
	    
	    scene = new Scene(root);
	    scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); // Apply CSS

	    stage.setScene(scene);
	    stage.show();
	}
	public void switchtoscene7(ActionEvent event) throws IOException {
	    Parent root = FXMLLoader.load(getClass().getResource("scene7.fxml"));
	    stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
	    
	    scene = new Scene(root);
	    scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); // Apply CSS

	    stage.setScene(scene);
	    stage.show();
	}
	public void switchtoscene8(ActionEvent event) throws IOException {
	    Parent root = FXMLLoader.load(getClass().getResource("scene8.fxml"));
	    stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
	    
	    scene = new Scene(root);
	    scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); // Apply CSS

	    stage.setScene(scene);
	    stage.show();
	}
}
