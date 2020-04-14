package app.hotel;



import app.hotel.MainFX.StageReadyEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component
public class Initializer implements ApplicationListener<StageReadyEvent> {

    @Value("classpath:/basic.fxml")
    private Resource chartResource;

   private String title;
   private ApplicationContext applicationContext;

    public Initializer(@Value("${spring.javafx.title}") String title, ApplicationContext applicationContext) {
        this.title = title;
        this.applicationContext = applicationContext;
    }

    @SneakyThrows
    @Override
    public void onApplicationEvent(StageReadyEvent event) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(chartResource.getURL());
            fxmlLoader.setControllerFactory(AClass -> applicationContext.getBean(AClass));
            Parent parent = fxmlLoader.load();
            Stage stage = event.getStage();
            stage.setScene(new Scene(parent, 800, 600));
            stage.setTitle(title);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException("WYJEBALO W CHUJ");
        }

    }
}
