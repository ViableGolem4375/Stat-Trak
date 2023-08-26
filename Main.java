package statpackage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.GraphicsEnvironment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main extends Application {
	
	public Scene homeScene;
	public Scene statScene;
	public Scene addStatScene;
	public Scene instructionsScene;
	Home home;
	StatPage stat;
	AddStat add;
	InstructionsPage instructions;
	
	public void start (Stage primaryStage) {
		//this.stage = primaryStage;
		home = new Home(primaryStage);
		homeScene = home.getScene();
		stat = new StatPage();
		statScene = stat.getScene();
		add = new AddStat();
		addStatScene = add.getScene();
		instructions = new InstructionsPage();
		instructionsScene = instructions.getScene();
		primaryStage.setFullScreen(false);
		primaryStage.setFullScreenExitHint("");
		primaryStage.setScene(homeScene);
		primaryStage.setTitle("Stat-Trak");
		primaryStage.show();
		
		EventHandlerClass.startButtonPress(primaryStage, statScene, stat);
		EventHandlerClass.addButtonPress(primaryStage, addStatScene, add);
		EventHandlerClass.returnButtonPress(primaryStage, statScene, stat);
		EventHandlerClass.returnButtonPress2(primaryStage, homeScene, home);
		EventHandlerClass.returnButtonPress3(primaryStage, homeScene, home);
		EventHandlerClass.instructionsButtonPress(primaryStage, instructionsScene, instructions);

	}
	
	public static void main(String[] args) {
		launch();
	}
}
