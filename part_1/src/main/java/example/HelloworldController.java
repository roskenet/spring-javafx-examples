package example;

import de.felixroske.jfxsupport.FXMLController;
import de.felixroske.jfxsupport.GUIState;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

@FXMLController
public class HelloworldController {
    private double xOffset = 0;
    private double yOffset = 0;
    
    @FXML
    private void onMousePressed(final MouseEvent event) {
        xOffset = event.getSceneX();
        yOffset = event.getSceneY();
    }
   
    @FXML
    private void onMouseDragged(final MouseEvent event) {
        GUIState.getStage().setX(event.getScreenX() - xOffset);
        GUIState.getStage().setY(event.getScreenY() - yOffset);
    }
}
