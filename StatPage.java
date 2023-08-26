package statpackage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.Component;
import java.awt.GraphicsEnvironment;
import java.awt.ScrollPane;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;

public class StatPage extends Main {
	
	Label title2;
	Label blank;
	Label blank2;
	Component test;
	static CustomButton addB;
	File userFile = new File ("stats.txt");
	GridPane root = new GridPane();
	ScrollPane pane = new ScrollPane();
	ScrollBar bar = new ScrollBar();
	int values;
	UserField fileSearch;
	CustomButton fileB;
    Font font = Font.loadFont("file:resources/fonts/Audiowide-Regular.ttf", 45);
    Font font2 = Font.loadFont("file:resources/fonts/Audiowide-Regular.ttf", 20);
	private final String backgroundColorSet = "-fx-background-color: linear-gradient(to bottom right, #000000 40%, #99059b 100%)";
	private TextFieldStyle dataFieldStyle = new TextFieldStyle("#FBCE3A","C9595F", "#E0D0B8");
	private int quantity;
	private int total;
	private int avg;
	private int median;
	private int max;
	private int min;
	Label statLabel;
	static CustomButton returnB2;
	
	public StatPage() {
		buildTitle2();
		buildBlank();
		buildAddButton();
		buildBlank2();
		buildFileSearchButton();
		fileButtonPress();
		buildStatLabel();
		buildReturnButton2();
		fileSearch = new UserField("Enter Data File Name: ", "#E0D0B8", dataFieldStyle);
	}

	private void buildTitle2() {
		this.title2 = new Label("Your Tracked Statistics");
		this.title2.setFont(font);
		this.title2.setTextFill(Color.YELLOW);
	}
	
	private void buildBlank() {
		this.blank = new Label(" ");
		this.blank.setFont(font);
		this.blank.setTextFill(Color.YELLOW);
	}
	
	private void buildBlank2() {
		this.blank2 = new Label("a");
		this.blank2.setFont(font);
		this.blank2.setTextFill(Color.YELLOW);
	}
	
	private void buildAddButton() {
		ButtonStyle addButton = new ButtonStyle();
		addButton.setBackground("linear-gradient(to bottom right, #000066 40%, #000000 100%)");
		addButton.setFontColor(Color.YELLOW);
		addButton.setFontSize(28);
		addB = CustomButton.customStaticButton("Add Statistic", addButton);
	}
	
	private void buildFileSearchButton() {
		ButtonStyle fileButton = new ButtonStyle();
		fileButton.setBackground("linear-gradient(to bottom right, #000066 40%, #000000 100%)");
		fileButton.setFontColor(Color.YELLOW);
		fileButton.setFontSize(28);
		fileB = CustomButton.customStaticButton("File Search", fileButton);
	}
	
	private void buildStatLabel() {
		this.statLabel = new Label("");
		this.statLabel.setFont(font2);
		this.statLabel.setTextFill(Color.YELLOW);
	}
	
	private void buildReturnButton2() {
		ButtonStyle returnButton2 = new ButtonStyle();
		returnButton2.setBackground("linear-gradient(to bottom right, #000066 40%, #000000 100%)");
		returnButton2.setFontColor(Color.YELLOW);
		returnButton2.setFontSize(28);
		returnB2 = CustomButton.customStaticButton("Return to Home Page", returnButton2);
	}
	
	public Scene getScene() {
		Scene statPage = new Scene(buildUserSpace(), 1000, 900);
		return statPage;
	}
	
	private VBox buildUserSpace() {
		VBox loginSpace2 = new VBox(10, blank, title2, fileSearch, fileB, addB, statLabel, returnB2);
		loginSpace2.setStyle(backgroundColorSet);
		loginSpace2.setAlignment(Pos.TOP_CENTER);
		return loginSpace2;
	}
	
	public void fileButtonPress() {
		fileB.setOnAction(new EventHandler<ActionEvent>() {
			@Override
				public void handle(ActionEvent a) {
				try {
					//String userFile = fileSearch.getText();
					File userFile = new File(fileSearch.getText());
					Scanner scanner;
					scanner = new Scanner(userFile);
					String line = null;
					List<Integer> list = new ArrayList<Integer>();
					while (scanner.hasNextLine()) {
						line = scanner.nextLine();
						values = Integer.parseInt(line);
						list.add(values);
						System.out.println(list);
					}
					
					for (int i = 0; i < (list.size() - 1); i++) {
						total = list.get(i) + list.get(i+1);
						list.set(i, total);
						list.remove(i+1);
					}
					
					quantity = list.size();
					
					avg = total / list.size();
					
					list.sort(Comparator.naturalOrder());
					
					min = list.get(0);
					
					int medianFinder = list.size() / 2;
					
					median = list.get(medianFinder);
					
					max = list.get(list.size() - 1);
					
					statLabel.setText("Total Values Entered: " + quantity + "\n" + 
					"Total Sum of Values: " + total + "\n" + "Average of Values: " + avg + "\n"
					 + "Lowest Value: " + min + "\n" + "Highest Value: " + max + "\n"
					  + "Median Value: " + median + "\n");
				}
				catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		});

	}
}

