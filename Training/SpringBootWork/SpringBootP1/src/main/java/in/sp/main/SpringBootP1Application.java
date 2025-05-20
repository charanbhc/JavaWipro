package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootP1Application 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootP1Application.class, args);
	}
}


// @SpringBootApplication:Combines @Configuration, @EnableAutoConfiguration,and @ComponentScan.Enables automatic configuration and scanning of components (@Controller, @Service, etc.).

// SpringApplication.run(...): Starts the Spring Boot application and launches the embedded Tomcat server.
