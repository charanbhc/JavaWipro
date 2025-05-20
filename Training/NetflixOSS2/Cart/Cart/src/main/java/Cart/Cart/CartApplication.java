package Cart.Cart;

import java.util.HashMap;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CartApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication spr=new SpringApplication(CartApplication.class); //2nd way of starting Tomcat Server
		System.out.println("Enter port no ");
		Scanner scan=new Scanner(System.in);
		int port=scan.nextInt();//User will type the port no. For ex: 9060
		//Dynamic configuration.
		HashMap portconf=new HashMap(); portconf.put("server.port", port);
		spr.setDefaultProperties(portconf);
		spr.run(args); //Start the tomcat server, Build the SpringBoot app, configure and deploy it.
	}
}
