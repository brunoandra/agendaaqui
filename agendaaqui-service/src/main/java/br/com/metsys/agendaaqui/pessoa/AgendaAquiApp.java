package br.com.metsys.agendaaqui.pessoa;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgendaAquiApp extends Application {

    public static void main(String[] args) {
        SpringApplication.run(AgendaAquiApp.class, args);
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
