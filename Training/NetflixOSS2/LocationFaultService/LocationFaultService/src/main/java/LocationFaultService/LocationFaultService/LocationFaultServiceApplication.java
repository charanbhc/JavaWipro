package LocationFaultService.LocationFaultService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication  
@EnableHystrixDashboard                          
@EnableCircuitBreaker  
public class LocationFaultServiceApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(LocationFaultServiceApplication.class, args);
	}
}
 
















//Enables the Hystrix Dashboard
/*--->This will start and configure Hystrix Dashboard. With Hystrix dashboard we know: -
 * How many instances are running ? On which machine, which port ?
 * Since how time they are running ?
 * Some more administrative information
 * Configuring Hystrix dashboard is optional
 * */
/* @EnableCircuitBreaker This annotation makes this application as a Hystrix Server or Circuit-Breaker.
 * This annotation is must*/