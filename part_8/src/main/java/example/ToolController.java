package example;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.Event;

@FXMLController
public class ToolController {

    public void doSomething(final Event e) {
        System.out.println("You pressed some button!");
    }
}
