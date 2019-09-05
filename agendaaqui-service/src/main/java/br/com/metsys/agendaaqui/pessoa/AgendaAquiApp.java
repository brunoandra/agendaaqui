package br.com.metsys.agendaaqui.pessoa;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "br.com.metsys.agendaaqui")
@EnableFeignClients(basePackages = "br.com.metsys.agendaaqui")
public class AgendaAquiApp extends Application {

    public static void main(String[] args) {
        SpringApplication.run(AgendaAquiApp.class, args);
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
