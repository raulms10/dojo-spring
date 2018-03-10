package co.edu.udea.dojospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DojoSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(DojoSpringApplication.class, args);
	}
}
