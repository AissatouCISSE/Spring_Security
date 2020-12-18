package sn.lpa.arlwebsite;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import sn.lpa.arlwebsite.dao.TaskRepository;
import sn.lpa.arlwebsite.entities.AppRole;
import sn.lpa.arlwebsite.entities.AppUser;
import sn.lpa.arlwebsite.entities.Task;
import sn.lpa.arlwebsite.service.AccountService;

@SpringBootApplication
public class GestionSecurityJwtApplication implements CommandLineRunner {

	@Autowired
	private TaskRepository taskRepository;
	
	@Autowired
	private AccountService accountService;
	public static void main(String[] args) {
		SpringApplication.run(GestionSecurityJwtApplication.class, args);
	}
	
	@Bean
	public BCryptPasswordEncoder getBCPE() {
		return new BCryptPasswordEncoder();
	}
	
	
	@Override
	 public void run(String... args) throws Exception {
			
			
			/*
			 * accountService.saveUser(new AppUser (null,null, null,"aicha","1234",null));
			 * accountService.saveUser(new AppUser (null,null,null,"aicha1","1234",null));
			 * accountService.saveRole(new AppRole (null,"ADMIN"));
			 * accountService.saveRole(new AppRole (null,"USER"));
			 * accountService.addRoleToUse("aicha", "ADMIN");
			 * accountService.addRoleToUse("aicha", "USER");
			 * accountService.addRoleToUse("aicha1", "USER");
			 */
			 
		
			/*
			 * Stream.of("T1", "T2", "T3").forEach(t->{ taskRepository.save(new
			 * Task(null,t)); });
			 */
		taskRepository.findAll().forEach(t->{
			System.out.println(t.getTaskname());
		});	
		}

}
