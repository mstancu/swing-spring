package springexample.views.mainView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.JPanel;
import java.awt.BorderLayout;

@Component
public class MainPanel extends JPanel {
    @Autowired
    MainTextField mainTextField;

    @Autowired
    BottomMainButton bottomMainButton;

    @PostConstruct
    public void init() {
        setLayout(new BorderLayout());
        add(mainTextField, BorderLayout.CENTER);
        add(bottomMainButton, BorderLayout.PAGE_END);
    }
}