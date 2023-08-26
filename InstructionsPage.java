package statpackage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InstructionsPage extends Main {

	Label instructionsLabel;
	Label title;
	static CustomButton returnB3;
	Font font = Font.loadFont("file:resources/fonts/Audiowide-Regular.ttf", 45);
	Font font2 = Font.loadFont("file:resources/fonts/Audiowide-Regular.ttf", 20);
	private final String backgroundColorSet = "-fx-background-color: linear-gradient(to bottom right, #000000 40%, #99059b 100%)";
	
	public InstructionsPage() {
		buildInstructions();
		buildTitle();
		buildReturnButton3();
	}
	
	private void buildTitle() {
		this.title = new Label("Instructions");
		this.title.setFont(font);
		this.title.setTextFill(Color.YELLOW);
	}
	
	private void buildInstructions() {
		this.instructionsLabel = new Label("Instructions For Use: \n"
				+ "To get started, click the start program button, then click the add statistic button.\n" + "Once in this screen, enter a number value (no spaces or other characters) into the first\n" + " text field, and a desired file name into the second text field. Repeat while changing the\n" + " number value entered to the desired value until done, then click the return button.\n" + " Once on this screen, enter an existing file name (including .txt) and click file search to\n" + " display data on the entered number values.");
		this.instructionsLabel.setFont(font2);
		this.instructionsLabel.setTextFill(Color.YELLOW);
	}
	
	private void buildReturnButton3() {
		ButtonStyle returnButton3 = new ButtonStyle();
		returnButton3.setBackground("linear-gradient(to bottom right, #000066 40%, #000000 100%)");
		returnButton3.setFontColor(Color.YELLOW);
		returnButton3.setFontSize(28);
		returnB3 = CustomButton.customStaticButton("Return to Home Page", returnButton3);
	}
	
	public Scene getScene() {
		Scene instructionsScreen = new Scene(buildUserSpace(), 1000, 900);
		return instructionsScreen;
	}
	
	private VBox buildUserSpace() {
		VBox loginSpace2 = new VBox(10, title, instructionsLabel, returnB3);
		loginSpace2.setStyle(backgroundColorSet);
		loginSpace2.setAlignment(Pos.TOP_CENTER);
		return loginSpace2;
	}
	
}
