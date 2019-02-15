package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import main.Main;

@Configuration
@ComponentScan({"service", "selene"})
public class AppConfiguration {
	@Bean(name = "main")
	Main mainApp() {
		return new Main();
	}

}
