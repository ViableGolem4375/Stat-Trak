package statpackage;

import javafx.scene.control.TextField;


public class CustomTextField extends TextField{ 
	
	CustomTextField(String mainBackgroundColor, String lineColor, String textColor){
		super();
		String textFieldStyle = "-fx-padding:0.9;-fx-font-weight:bold;-fx-text-fill:"+ textColor +";-fx-font-size:18px;"
						+ "-fx-background-color: "+mainBackgroundColor+","+lineColor+" ;-fx-background-insets: 0, 0 0 1 0";
		this.setStyle(textFieldStyle);
	}
	
	public static CustomTextField customTextField(TextFieldStyle thisStyle){
		CustomTextField newField = new CustomTextField(thisStyle.primary, thisStyle.lineColor, thisStyle.textColor);
		return newField;
	}
}
