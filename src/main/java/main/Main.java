package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import selenium.SeleniumRunner;
import spring.config.AppConfiguration;

public class Main {
	@Autowired
	private SeleniumRunner scriptRunner;

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		Main mainApp = (Main) context.getBean("main");
		mainApp.run();
	}

	private void run() {
		scriptRunner.access("");
	}
}
