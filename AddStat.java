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

public class AddStat extends Main {
	
	Label title3;
	Label blank;
	Label warning;
	CustomButton addB2;
	static CustomButton returnB;
	static UserField data;
	static UserField file;
	Font font = Font.loadFont("file:resources/fonts/Audiowide-Regular.ttf", 45);
	Font font2 = Font.loadFont("file:resources/fonts/Audiowide-Regular.ttf", 15);
	private final String backgroundColorSet = "-fx-background-color: linear-gradient(to bottom right, #000000 40%, #99059b 100%)";
	private TextFieldStyle dataFieldStyle = new TextFieldStyle("#FBCE3A","C9595F", "#E0D0B8");

	
	public AddStat() {
		buildTitle3();
		buildBlank();
		buildAddButton2();
		buildWarning();
		addButtonPress();
		buildReturnButton();
		data = new UserField("Enter Data here: ", "#E0D0B8", dataFieldStyle);
		file = new UserField("Enter Data Storage File Name Here (Enter .txt in the file name): ", "#E0D0B8", dataFieldStyle);
	}
	
	private void buildTitle3() {
		this.title3 = new Label("Track a New Statistic");
		this.title3.setFont(font);
		this.title3.setTextFill(Color.YELLOW);
	}
	
	private void buildWarning() {
		this.warning = new Label(" ");
		this.warning.setFont(font2);
		this.warning.setTextFill(Color.YELLOW);
	}
	
	private void buildBlank() {
		this.blank = new Label("");
		this.blank.setFont(font);
		this.blank.setTextFill(Color.YELLOW);
	}
	
	private void buildAddButton2() {
		ButtonStyle addButton2 = new ButtonStyle();
		addButton2.setBackground("linear-gradient(to bottom right, #000066 40%, #000000 100%)");
		addButton2.setFontColor(Color.YELLOW);
		addButton2.setFontSize(28);
		addB2 = CustomButton.customStaticButton("Add Statistic", addButton2);
	}
	
	private void buildReturnButton() {
		ButtonStyle returnButton = new ButtonStyle();
		returnButton.setBackground("linear-gradient(to bottom right, #000066 40%, #000000 100%)");
		returnButton.setFontColor(Color.YELLOW);
		returnButton.setFontSize(28);
		returnB = CustomButton.customStaticButton("Return to Stats Page", returnButton);
	}
	
	public Scene getScene() {
		Scene statPage = new Scene(buildUserSpace(), 1000, 900);
		return statPage;
	}
	
	private VBox buildUserSpace() {
		VBox loginSpace2 = new VBox(10, blank, title3, data, file, addB2, warning, returnB);
		loginSpace2.setStyle(backgroundColorSet);
		loginSpace2.setAlignment(Pos.TOP_CENTER);
		return loginSpace2;
	}
	
	public void addButtonPress() {
		addB2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
				public void handle(ActionEvent aei) {
					String dataEntry = data.getText();
					File userFile = new File (file.getText());
					try {
						userFile.createNewFile();
						if (userFile.createNewFile()) {
							System.out.println("work");
						}
						BufferedWriter writer = new BufferedWriter(new FileWriter(userFile, true));
						if (aei.getSource() == addB2) {
							writer.write(dataEntry);
							writer.write(System.getProperty("line.separator"));
							writer.close();
							warning.setText("Statistic Successfully Added");
						}
					}
					catch (IOException ex) {
						ex.printStackTrace();
					}
			}
		});

	}
}
