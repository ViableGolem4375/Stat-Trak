package statpackage;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class ButtonTray extends HBox{
	private ButtonStyle trayStyle = new ButtonStyle();
	CustomButton editButton;
	CustomButton deleteButton;
	CustomButton saveButton;
	static Font font = Font.loadFont("file:resources/fonts/Audiowide-Regular.ttf", 45);
	
	
	ButtonTray(int padSize){
		super(padSize);
		styleTray();
		defineButtons();	
	}
	
	public static ButtonTray buttonTray() {
		ButtonTray buttonTray = new ButtonTray(30);
		buttonTray.stackButtons(buttonTray);
		return buttonTray;
	}
	
	private void styleTray() {
		trayStyle.setBackground("#FBCE3A");
		//trayStyle.setFontChoice(font);
		trayStyle.setFontColor(Color.BEIGE);
		trayStyle.setFontSize(28);
	}
	
	public static ButtonStyle getButtonStyle() {
		ButtonStyle theStyle = new ButtonStyle();
		theStyle.setBackground("#FBCE3A");
		//theStyle.setFontChoice(font);
		theStyle.setFontColor(Color.BEIGE);
		theStyle.setFontSize(28);
		return theStyle;
	};
	
	private void defineButtons() {
		editButton = CustomButton.customStaticButton("Edit", trayStyle);
		deleteButton = CustomButton.customStaticButton("Delete", trayStyle);
		saveButton = CustomButton.customStaticButton("Save", trayStyle);
	}
	
	private void stackButtons(ButtonTray thisTray) {
		thisTray.getChildren().addAll(editButton, deleteButton, saveButton);
		thisTray.setAlignment(Pos.CENTER);
	}
}

