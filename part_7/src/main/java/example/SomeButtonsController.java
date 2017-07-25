package example;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.Event;
import javafx.fxml.FXML;

@FXMLController
public class SomeButtonsController {

    @FXML
    public void reactOnClick(final Event e) {
        System.out.println("Clicked a button");
    }
}
