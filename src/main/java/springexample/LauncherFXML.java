package springexample;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springexample.controller.ControllerFXML;

public class LauncherFXML extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigSpring.class);
        SpringFxmlLoader loader = new SpringFxmlLoader(context);

        Parent root = (Parent) loader.load("/sample.fxml", ControllerFXML.class);
        Scene scene = new Scene(root, 520, 240);
        scene.getStylesheets().add("/fxmlapp.css");
        stage.setScene(scene);
        stage.setTitle("JFX2.0 Spring");
        stage.show();
    }
}
