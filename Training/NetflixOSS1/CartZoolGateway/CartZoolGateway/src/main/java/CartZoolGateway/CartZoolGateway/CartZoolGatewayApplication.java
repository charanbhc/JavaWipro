package CartZoolGateway.CartZoolGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages={"CartZoolGateway.CartZoolGateway"})
@EnableZuulProxy  

// Make the microservices as a proxy server. throgh the proxy server will be calling all the services
// This proxy server filters the url,does routing. But it doesnot do load balancing and fault tolerance

public class CartZoolGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartZoolGatewayApplication.class, args);
	}
	@Bean
	public  PreFilter  preFilter()
	{
		return  new PreFilter();
	}
	@Bean
	public  PostFilter  postFilter()
	{
		return  new PostFilter();
	}
	
	@Bean
	public  RouteFilter  routeFilter() //callback methods
	{
		return  new RouteFilter();
	}
	@Bean
	public  ErrorFilter  errorFilter()
	{
		return  new ErrorFilter();
	}
}
