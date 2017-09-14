package learn.spring.camel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCamelApplication implements CommandLineRunner{

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(SpringCamelApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("Joining thread, you can press Ctrl+C to shutdown application");
        Thread.currentThread().join();
		
	}
}
