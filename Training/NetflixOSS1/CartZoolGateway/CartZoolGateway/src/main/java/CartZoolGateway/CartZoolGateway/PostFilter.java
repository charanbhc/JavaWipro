package CartZoolGateway.CartZoolGateway;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

// After performing filtering of urls what task has to be done.
public class PostFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		System.err.println("PostFilter-run()");
		System.err.println("PostFilter ");

		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		System.err.println("PostFilter-filterType()");
		return "post";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		System.err.println("PostFilter-filterOrder()");
		return 1; //1 Ascending.  0 Descending
	}

}
