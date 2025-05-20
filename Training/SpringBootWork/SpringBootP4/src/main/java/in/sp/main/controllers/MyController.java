package in.sp.main.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sp.main.entities.User;

@RestController
public class MyController 
{
	@PostMapping("/user")
	public String addUserDetails(@RequestBody User user)
	{
		return "index";
	}
}


/* @RestController is used to create Restful web services.It combines @Controller and @ResponseBody(we use when we want to specify it is a JSON data or 
 * data that will return REST API),
 * Purpose of @RestController Handles HTTP Requests (GET, POST, PUT, DELETE).
 * Returns JSON/XML Responses instead of a traditional web page (HTML).
 * Eliminates the need for @ResponseBody on each method.
 * By default, @Controller methods return a view (HTML).
 * @ResponseBody tells Spring to return raw data (JSON, XML, etc.) instead of a view.
 * It is automatically included in @RestController, so no need to add it manually.
 * What Does @RequestBody Do?
 * Required for POST, PUT, and PATCH methods.
 * @RequestBody is used to convert JSON data from an HTTP request into a Java object.Extracts JSON from the request body.
 * Automatically converts JSON to a Java object using Spring's HttpMessageConverter (Jackson).
 * Used in @PostMapping, @PutMapping, and @PatchMapping.
 */
