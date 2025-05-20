package in.sp.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootP2Application implements CommandLineRunner
{

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootP2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		myclass().printmsg("Ajay");     // call Bean class method
	}
	
	@Bean
	public MyClass myclass()                   // method that return object of its Bean class(Myclass)
	{	
		return new MyClass();
	}

}


// CommandLIneRunner: It is a Functional interface which execute all the provided code  in run method after the Spring Boot Application 
// is initialized.So we have to override run method from CommandLineRunner Interface.







