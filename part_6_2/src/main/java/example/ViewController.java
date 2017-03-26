package example;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.Event;

@FXMLController
public class ViewController {
    
    public void showFirstView(Event event) {
        Main.showView(FirstView.class);
    }

    public void showSecondView(Event event) {
        Main.showView(SecondView.class);
    }
}
