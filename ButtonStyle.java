package statpackage;

import java.awt.Font;

import javafx.scene.paint.Color;

public class ButtonStyle {
	public String htmlColor;
	public Color fontColor;
	public Font fontChoice;
	public int fontSize;
	
	public ButtonStyle() {}
	
	public void setBackground(String backColor) {
		htmlColor = backColor;
	}
	public void setFontColor(Color colorFont) {
		fontColor = colorFont;
	}
	public void setFontChoice(Font font) {
		fontChoice = font;
	}
	public void setFontSize(int size) {
		fontSize = size;
	}
}
