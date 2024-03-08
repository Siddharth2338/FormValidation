package in.sid.SpringDataJpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(Application.class, args);
		
		PlayerRepository playerRepository=context.getBean(PlayerRepository.class);
		
		Player p1 = new Player();
		p1.setPlayerId(102);
		p1.setPlayerName("Sachin");
		p1.setPlayerAge(44);
		p1.setLocation("Mumbai");
		
		playerRepository.save(p1);
		System.out.println("Record Inserted..");
		System.out.println(playerRepository.getClass().getName());
	}

}
