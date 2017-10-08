package springexample.views.mainView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.JFrame;
import java.awt.Dimension;

@Component
@Scope("singleton")
public class MainFrame extends JFrame {
    @Autowired
    MainPanel contentPane;

    @Value("${title}")
    String frameTitle;

    @PostConstruct
    public void init() {
        java.awt.EventQueue.invokeLater(() -> {
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setSize(new Dimension(300, 300));
            setTitle(frameTitle);
            add(contentPane);
        });
    }
}