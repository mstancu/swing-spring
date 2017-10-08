package springexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springexample.views.mainView.MainFrame;

public class LauncherSwing {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigSpring.class);

        MainFrame mainFrame = (MainFrame) context.getBean("mainFrame");
        mainFrame.setVisible(true);
    }
}