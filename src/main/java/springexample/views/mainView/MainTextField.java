package springexample.views.mainView;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.JTextField;
@Component
public class MainTextField extends JTextField {
    @Value("${text_initial}")
    String textInitial;

    @PostConstruct
    public void init() {
        setText(textInitial);
    }
}