package springexample.views.mainView;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.JTextField;
@Component
public class MainTextField extends JTextField {
    @PostConstruct
    public void init() {
        setText("hello world");
    }
}