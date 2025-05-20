package CartZoolGateway.CartZoolGateway;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

// Configuring url filtering. This decides which request must be blocked and which must not
public class RouteFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		System.err.println("RouteFilter-run()");
		System.err.println("RouteFilter");
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		System.err.println("RouteFilter-filterType()");
		return "route";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		System.err.println("RouteFilter-filterOrder()");
		return 1;
	}

}
