package LookUpEureka.LookUpEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class LookUpEurekaApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(LookUpEurekaApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate  resttemp() 
	{
		return new RestTemplate();
	}
}












//---> Notes <---

// A Eureka Client is a microservice that registers itself with the Eureka Server and fetches service details from it.