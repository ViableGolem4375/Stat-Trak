package statpackage;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;

class HoverHandler implements EventHandler<ActionEvent>{
	public void handle(ActionEvent event) {
		Button button = (Button)event.getSource();
		if(button.isHover()) {
            button.setEffect(new DropShadow());
        } else {
            button.setEffect(null);
        }
	}
}
