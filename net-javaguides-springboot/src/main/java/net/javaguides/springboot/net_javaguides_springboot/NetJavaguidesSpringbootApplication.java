package net.javaguides.springboot.net_javaguides_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "net.javaguides.springboot.net_javaguides_springboot") //ajouté pour controle de composant au cas où
public class NetJavaguidesSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetJavaguidesSpringbootApplication.class, args);
	}

}
