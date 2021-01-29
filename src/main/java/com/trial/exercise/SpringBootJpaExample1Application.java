package com.trial.exercise;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import com.trial.exercise.model.Exchange;
import com.trial.exercise.repository.ExchangeRepository;

@SpringBootApplication
public class SpringBootJpaExample1Application implements CommandLineRunner{
     @Autowired
    ExchangeRepository rep;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaExample1Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
//		
		//Exchange e1 = new Exchange("Teater", 40);
		
//		 repositery.save(e1);
//	     repositery.save(new Exchange("Recreation", 100));
//			
//	     repositery.save(new Exchange("Car rent", 590));
//	     repositery.save(new Exchange("Daily expense", 350));
//	     repositery.save(new Exchange("Banana ", 10));
//	     	
//	          Sort s = Sort.by(Sort.Direction.DESC, "amount");
//	      Iterable<Exchange> iterator = repositery.findAll(s);
//		             
//			  System.out.println("All exchange items: ");
//			  iterator.forEach(ex -> System.out.println(ex));
			      	         
//			     List<Exchange> teater = repositery.findByItem("teater");
//			     	System.out.println("\nHow does my car rent cost?: ");
//			     	teater.forEach(item -> System.out.println(item));
//			     	
//			     	List<Exchange> expensiveItems = repositery.listItemWithPriceOver(200);
//			     	System.out.println("\nExpensive Items: ");
//			     	expensiveItems.forEach(item -> System.out.println(item));
//			     		Example<Exchange> ex1 = Example.of(e1);
//			     		Iterable<Exchange> iterator = repositery.findAll(ex1);
//			     		iterator.forEach(item -> System.out.println(item));
		//List<Expense> expensiveItems = repository.listItemsWithPriceOver(200);
		//System.out.println("\nExpensive Items: ");
		//expensiveItems.forEach(item -> System.out.println(item));
//				Example<Expense> ex1 = Example.of(e1);
//				Iterable<Expense> iterator = repository.findAll(ex1);
//				iterator.forEach(ex -> System.out.println(ex));
			Optional<Exchange> op = rep.findById(2L);
				// System.out.println(op.get());
			     		}


		
	}

