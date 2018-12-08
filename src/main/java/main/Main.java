package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.config.AppConfiguration;
import test.Add;

public class Main {
	@Autowired
	private Add add;

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		Main mainApp = (Main) context.getBean("main");
		mainApp.run();
	}

	private void run() {
		add.print();
	}
}
