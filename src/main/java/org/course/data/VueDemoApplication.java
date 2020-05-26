package org.course.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
//@EntityScan("org.course.data.DAO.LoginDAO.LoginEntity")
public class VueDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueDemoApplication.class, args);
	}

}
