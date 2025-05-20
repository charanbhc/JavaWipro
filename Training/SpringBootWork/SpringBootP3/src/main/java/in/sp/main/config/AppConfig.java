package in.sp.main.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.main.beans.Student;

@Configuration
public class AppConfig 
{
	/* Alternative Using Lambda Expression (More Modern)
	 * @Bean
	 * public CommandLineRunner cmdLineRunner() { return args -> {
	 * stdBean1().display(); System.out.println(); stdBean2().display(); }; } Since
	 * CommandLineRunner is a functional interface (has only one method), we can use
	 * a lambda expression instead of an anonymous class.
	 **
	@Bean*/
	
	// The method cmdLineRunner() returns an instance of an anonymous class that implements CommandLineRunner.
	public CommandLineRunner cmdLineRunner()
	{
		return new CommandLineRunner() {    //   Anonymous class implementing the interface
			@Override
		    public void run(String...args)throws Exception
			{
				stdBean1().display();
				System.out.println();
				stdBean2().display();
			}
		};
	}
	@Bean
	public Student stdBean1()
	{
		return new Student("Ajay",101,90.0f);
	}
	
	@Bean
	public Student stdBean2()
	{
		return new Student("Vishal",102,91.0f);
	}
	
}
