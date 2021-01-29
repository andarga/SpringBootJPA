package com.trial.exercise.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trial.excercise.repository.error.RecordNotFoundException;
import com.trial.exercise.model.Exchange;
import com.trial.exercise.repository.ExchangeRepository;

@RestController
@RequestMapping("/rest/service/expense")
public class ExchangeRS {
	@Autowired
	ExchangeRepository rep;

	@GetMapping(path = "/find/{id}", produces = "application/json")
	public Exchange find(@PathVariable("id") long id) {
		Optional<Exchange> op = rep.findById(id);
		Exchange ex = null;
		if (op.isPresent()) {
			ex = op.get();
		}
		System.out.println("hello" + ex);
		return ex;
	}

	@GetMapping(produces = "application/json")
	public List<Exchange> findAll() {

		return rep.findAll();
	}
	@PostMapping
	public void save(@RequestBody Exchange e) {
		rep.save(e);
	}

	@PutMapping(path = "/{id}")
	public Exchange update(@RequestBody Exchange e, @PathVariable long id) {
		Optional<Exchange> op = rep.findById(id);
		if (op.isPresent()) {
			Exchange old = op.get();
			old.setItem(e.getItem());
			old.setAmount(e.getAmount());
			rep.save(old);
		} else {
			throw new RecordNotFoundException(id + " doesnt exist");
		}
		return e;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		rep.deleteById(id);
	}
}

//@RestController
//@RequestMapping("/rest/service/expense")
//public class ExchangeRS {
//	@Autowired
//	ExchangeRepository rep;
//
//	@GetMapping(path = "/find", produces = "application/json")
//	public Exchange find(@RequestParam("id") long id) {
//		Optional<Exchange> op = rep.findById(id);
//		Exchange ex = null;
//		if (op.isPresent()) {
//			ex = op.get();
//		}
//		System.out.println("hello" + ex);
//		return ex;
//	}
//	@GetMapping(produces = "application/json")
//	public List<Exchange> findAll(){
//		return rep.findAll();
//	}
//	@PostMapping
//	public void save(@RequestBody Exchange e) {
//		rep.save(e);
//	}
//	@PostMapping(path="/{id}")
//	public Exchange update(@RequestBody Exchange e, @PathVariable long id) {
//		Optional<Exchange>op=rep.findById(id);
//		if(op.isPresent()){
//			Exchange old =op.get();
//			old.setItem(e.getItem());
//			old.setAmount(e.getAmount());
//			rep.save(old);
//		}
//		else {
//			throw new RecordNotFoundException("doesnt exist", id);
//		}
//		return e;
//		
//		}
//	@DeleteMapping("exchanges/{id}")
//	public void deleteExchange(@PathVariable long id) {
//		rep.deleteById(id);
//	}
//

//}
