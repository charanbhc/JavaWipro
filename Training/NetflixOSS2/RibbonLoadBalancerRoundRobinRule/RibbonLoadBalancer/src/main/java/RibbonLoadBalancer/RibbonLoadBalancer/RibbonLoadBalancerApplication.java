package RibbonLoadBalancer.RibbonLoadBalancer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class RibbonLoadBalancerApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(RibbonLoadBalancerApplication.class, args);
	}
}
