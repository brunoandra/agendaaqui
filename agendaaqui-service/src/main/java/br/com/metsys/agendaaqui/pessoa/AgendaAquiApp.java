package br.com.metsys.agendaaqui.pessoa;

import br.com.metsys.agendaaqui.pessoa.controller.config.TraceHeadersResponse;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.GenericFilterBean;

@SpringBootApplication(scanBasePackages = "br.com.metsys.agendaaqui")
@EnableFeignClients(basePackages = "br.com.metsys.agendaaqui")
@ServletComponentScan
public class AgendaAquiApp extends Application {

    public static void main(String[] args) {
        SpringApplication.run(AgendaAquiApp.class, args);
    }

    @Override
    public void start(Stage primaryStage) {

    }

    @Bean
    public FilterRegistrationBean someFilterRegistration() {

        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(myFilter());
        registration.addUrlPatterns("/*");
        registration.setOrder(1);
        return registration;
    }

    @Bean(name = "someFilter")
    public GenericFilterBean myFilter() {
        return new TraceHeadersResponse();
    }
}
