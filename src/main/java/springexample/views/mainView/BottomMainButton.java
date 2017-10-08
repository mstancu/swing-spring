package springexample.views.mainView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import springexample.controller.ButtonListener;

import javax.annotation.PostConstruct;
import javax.swing.JButton;

@Component
@Scope("prototype")
public class BottomMainButton extends JButton {
    @Autowired
    private ButtonListener listener;

    @PostConstruct
    public void init() {
        this.setText("Press me");
        this.addActionListener(listener);
    }
}