package spring.sph2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpH2Application {
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpH2Application.class, args);
	}

}
