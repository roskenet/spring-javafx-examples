package example;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import javax.annotation.PostConstruct;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.roskenet.jfxsupport.test.GuiTest;
import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloworldViewTest extends GuiTest {

    @PostConstruct
    public void init() throws Exception {
        init(HelloworldView.class);
    }
    
    @Test
    public void testClickButton_Anton() {
        clickOn("#nameField")
            .write("Anton")
            .clickOn("#helloButton");

        assertThat(labelText(), is("Hello Anton!"));
    }

    @Test
    public void testClickButton_Berta() {
        clickOn("#nameField")
            .write("Berta")
            .clickOn("#helloButton");

        assertThat(labelText(), is("Hello Unknown Stranger!"));
    }
    
    private String labelText() {
        return ((Label) find("#helloLabel")).getText();
    }
    
    @After
    public void resetValues() {
        // You are responsible for cleaning up your Beans!
        Platform.runLater(() -> {
            TextField helloLabel = (TextField) find("#nameField");
            helloLabel.setText("");
        });
    }

}
