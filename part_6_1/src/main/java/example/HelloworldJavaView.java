package example;

import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.FXMLView;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

@FXMLView
public class HelloworldJavaView extends AbstractFxmlView {

    private Pane myJavaCodedPane;
    
    public HelloworldJavaView() {
       Pane pane = new Pane();
       Button button = new Button("A Button");
       
       pane.getChildren().add(button);
       myJavaCodedPane = pane;
    }
    
    @Override
    public Parent getView() {
        return myJavaCodedPane;
    }
}
