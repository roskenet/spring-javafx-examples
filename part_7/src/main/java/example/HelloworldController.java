package example;

import org.springframework.beans.factory.annotation.Autowired;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

@FXMLController
public class HelloworldController {

    @FXML
    Pane myDynamicPane;
    
    @Autowired
    SomeButtonsView someButtonsView;
    
    @Autowired
    SomeOtherView someOtherView;

    public void showSomeButtonView(final Event e) {
        myDynamicPane.getChildren().clear();
        myDynamicPane.getChildren().add(someButtonsView.getView());
    }
    
    public void showSomeOtherView(final Event e) {
        myDynamicPane.getChildren().clear();
        myDynamicPane.getChildren().add(someOtherView.getView());
    }
}
