package com.app.utlog;
	
import javafx.application.Application;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// Get the current monitor screen dimension
			Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
			
			//Step 1 - Load the AnchorPane (Main Screen)
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("screens/RootScreen.fxml"));
			
			//Step 2 - Setup the scene and add default style CSS
			Scene scene = new Scene(root,primaryScreenBounds.getWidth(),primaryScreenBounds.getHeight());
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setTitle("Unit Test Log Utility");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
