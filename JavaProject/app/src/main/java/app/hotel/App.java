package app.hotel;



import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("app.hotel") //to activate MongoDB repositories
public class App {
    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }
}
