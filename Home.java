package statpackage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
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

public class Home extends Main {
	
	Label title;
	Label blank;
	Label blank2;
	Label blank3;
	Label blank4;
	Label blank5;
	static CustomButton startB;
	static CustomButton instructionsB;
    Font font = Font.loadFont("file:resources/fonts/Audiowide-Regular.ttf", 45);
	private final String backgroundColorSet = "-fx-background-color: linear-gradient(to bottom right, #000000 40%, #99059b 100%)";

	public Home(Stage primaryStage) {
		buildTitle();
		buildStartButton();
		buildBlank();
		buildBlank2();
		buildBlank3();
		buildBlank4();
		buildBlank5();
		buildInstructionsButton();
	}
	
	private void buildTitle() {
		this.title = new Label("Stat-Trak");
		this.title.setFont(font);
		this.title.setTextFill(Color.YELLOW);
	}
	
	private void buildBlank() {
		this.blank = new Label(" ");
		this.blank.setFont(font);
		this.blank.setTextFill(Color.YELLOW);
	}
	private void buildBlank2() {
		this.blank2 = new Label(" ");
		this.blank2.setFont(font);
		this.blank2.setTextFill(Color.YELLOW);
	}
	private void buildBlank3() {
		this.blank3 = new Label(" ");
		this.blank3.setFont(font);
		this.blank3.setTextFill(Color.YELLOW);
	}
	private void buildBlank4() {
		this.blank4 = new Label(" ");
		this.blank4.setFont(font);
		this.blank4.setTextFill(Color.YELLOW);
	}
	private void buildBlank5() {
		this.blank5 = new Label(" ");
		this.blank5.setFont(font);
		this.blank5.setTextFill(Color.YELLOW);
	}
	
	private void buildInstructionsButton() {
		ButtonStyle instructionsButton = new ButtonStyle();
		instructionsButton.setBackground("linear-gradient(to bottom right, #000066 40%, #000000 100%)");
		instructionsButton.setFontColor(Color.YELLOW);
		instructionsButton.setFontSize(28);
		instructionsB = CustomButton.customStaticButton("Instructions", instructionsButton);
	}
	
	private void buildStartButton() {
		ButtonStyle startButton = new ButtonStyle();
		startButton.setBackground("linear-gradient(to bottom right, #000066 40%, #000000 100%)");
		startButton.setFontColor(Color.YELLOW);
		startButton.setFontSize(28);
		startB = CustomButton.customStaticButton("Start Program", startButton);
	}
	
	public Scene getScene() {
		Scene homeScreen = new Scene(buildUserSpace(), 1000, 900);
		return homeScreen;
	}
	
	private VBox buildUserSpace() {
		VBox loginSpace2 = new VBox(10, blank, title, blank2, blank3, blank4, blank5, startB, instructionsB);
		loginSpace2.setStyle(backgroundColorSet);
		loginSpace2.setAlignment(Pos.TOP_CENTER);
		return loginSpace2;
	}
	
}
