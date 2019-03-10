package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Pet;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PetRepository;

@SpringBootApplication
public class SpringBeanPetApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeanPetApplication.class, args);
	}

	@Autowired
	PetRepository repo;

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using an existing bean
		Pet a = appContext.getBean("pet", Pet.class);
		a.setName("Ellie");
		a.setType("dog"); 
		a.setGender("F");
		a.setWeight(15);
		a.setMicrochip(12345);
		repo.save(a);
				
		//Creating an object to use – not managed by Spring
		//Pet a = new Pet("Ellie", "dog","F", 15, 12345);
		//repo.save(a);
		Pet b = new Pet("Mittens", "cat","F", 12, 67890);
		repo.save(b);
		Pet c = new Pet("Khloe", "cat","F", 11, 50327);
		repo.save(c);
		Pet d = new Pet("Parsley", "rabbit","F", 9, 11223);
		repo.save(d);
		Pet e = new Pet("Moose", "cat","M", 10, 82498);
		repo.save(e);


		List<Pet> allMyPets = repo.findAll();
		for (Pet critter : allMyPets) {
			System.out.println(critter.toString());
		}

	}
}
