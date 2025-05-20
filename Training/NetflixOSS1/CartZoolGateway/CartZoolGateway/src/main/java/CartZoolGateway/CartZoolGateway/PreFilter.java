package CartZoolGateway.CartZoolGateway;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

// Before filtering urls perform this tasks
public class PreFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		System.err.println("PreFilter-run()");
		RequestContext  reqcontext=RequestContext.getCurrentContext(); //Retrieves the client info
		HttpServletRequest  hsreq=reqcontext.getRequest();
		System.err.println("-------------------Client Info-------------------");
		System.out.println(hsreq.getRemoteHost() + "\t" + hsreq.getMethod() + hsreq.getRequestURL());
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		System.err.println("PreFilter-filterType()");
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		System.err.println("PreFilter-filterOrder()");
		return 1;
	}

}
