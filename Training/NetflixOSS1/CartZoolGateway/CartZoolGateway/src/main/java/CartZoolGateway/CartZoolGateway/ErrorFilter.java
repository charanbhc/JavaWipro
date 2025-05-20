package CartZoolGateway.CartZoolGateway;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class ErrorFilter extends ZuulFilter {
	@Autowired(required=false)
	RestTemplate  rest;
	
	
	@Bean
	public RestTemplate rest()
	{
		return new RestTemplate();
	}
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		System.err.println("ErrorFilter-run()");
		System.err.println("ErrorFilter");
		//ResponseEntity <String>  cartResponse=(ResponseEntity<String>)rest.exchange("http://localhost:8000/show",HttpMethod.GET,null, java.lang.String.class);
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		System.err.println("ErrorFilter-filterType()");
		return "error";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		System.err.println("ErrorFilter-filterOrder()");
		return 1;
	}



}
