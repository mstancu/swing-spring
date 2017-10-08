package springexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springexample.views.mainView.MainFrame;

public class Launcher {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MainFrame mainFrame = (MainFrame) context.getBean("mainFrame");
        mainFrame.setVisible(true);
    }
}