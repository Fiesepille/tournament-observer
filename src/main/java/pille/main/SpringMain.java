package pille.main;

import javax.transaction.Transactional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class SpringMain implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Started");
		
	}
}
