package example;

import org.springframework.beans.factory.annotation.Autowired;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.Event;

@FXMLController
public class ViewController {
    
    @Autowired
    private Main main;
    
    public void showFirstView(Event event) {
        main.showView(FirstView.class);
    }

    public void showSecondView(Event event) {
        main.showView(SecondView.class);
    }
}
