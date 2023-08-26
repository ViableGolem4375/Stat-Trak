package statpackage;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class EventHandlerClass extends Main {

	public static void startButtonPress(Stage primaryStage, Scene statScene, StatPage stat) {
		Home.startB.setOnAction(new EventHandler<ActionEvent>( ) {
			@Override
				public void handle(ActionEvent aeo) {
					primaryStage.setScene(statScene);
	        		primaryStage.centerOnScreen();
			}
		});
	}
	
	public static void addButtonPress(Stage primaryStage, Scene addStatScene, AddStat add) {
		StatPage.addB.setOnAction(new EventHandler<ActionEvent>( ) {
			@Override
				public void handle(ActionEvent ae) {
					primaryStage.setScene(addStatScene);
	        		primaryStage.centerOnScreen();
			}
		});
	}
	
	public static void returnButtonPress(Stage primaryStage, Scene statScene, StatPage stat) {
		AddStat.returnB.setOnAction(new EventHandler<ActionEvent>( ) {
			@Override
				public void handle(ActionEvent aei) {
				primaryStage.setScene(statScene);
        		primaryStage.centerOnScreen();
			}
		});
	}
	
	public static void returnButtonPress2(Stage primaryStage, Scene homeScene, Home home) {
		StatPage.returnB2.setOnAction(new EventHandler<ActionEvent>( ) {
			@Override
				public void handle(ActionEvent aei) {
				primaryStage.setScene(homeScene);
        		primaryStage.centerOnScreen();
			}
		});
	}
	
	public static void returnButtonPress3(Stage primaryStage, Scene homeScene, Home home) {
		InstructionsPage.returnB3.setOnAction(new EventHandler<ActionEvent>( ) {
			@Override
				public void handle(ActionEvent aei) {
				primaryStage.setScene(homeScene);
        		primaryStage.centerOnScreen();
			}
		});
	}
	
	public static void instructionsButtonPress(Stage primaryStage, Scene instructionsScene, InstructionsPage instructions) {
		Home.instructionsB.setOnAction(new EventHandler<ActionEvent>( ) {
			@Override
				public void handle(ActionEvent aei) {
				primaryStage.setScene(instructionsScene);
        		primaryStage.centerOnScreen();
			}
		});
	}
	
}
