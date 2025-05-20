package in.sp.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class MyController 
{
	@GetMapping("/")
	@ResponseBody
	public String printHello()
	{
		return "hello World";
	}
}


//What Happens When You Run This Project?
// 1️. Run SpringBootP1Application.java
//    Spring Boot starts and Tomcat runs on http://localhost:8080/.

// 2️. Visit http://localhost:8080/ in a browser
//
//    The request reaches DispatcherServlet(The front controller that manages all requests and routes the request to the appropriate @Controller).
//    It finds the MyController class handling /. 
//    Calls printHello(), which returns "hello World".(and then Controller processes the request)