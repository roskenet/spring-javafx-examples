package example;

import java.text.MessageFormat;
import java.util.ResourceBundle;

import org.springframework.stereotype.Component;

@Component
public class DefaultAwesomeActionService implements AwesomeActionService {

    private ResourceBundle bundle = ResourceBundle.getBundle("example.helloworld");

    @Override
    public String processName(final String name) {
        return MessageFormat.format(bundle.getString("greeting"), name);
    }

}
