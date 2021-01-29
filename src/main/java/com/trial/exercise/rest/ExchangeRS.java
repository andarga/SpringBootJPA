package com.trial.exercise.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trial.exercise.model.Exchange;
import com.trial.exercise.repository.ExchangeRepository;

@RestController
@RequestMapping("/rest/service/expense")
public class ExchangeRS {
	@Autowired
	ExchangeRepository  repositery;

	@GetMapping(path = "/find", produces = "application/json")
	public Exchange find(@RequestParam("id") long id) {
		Optional<Exchange> op = repositery.findById(id);
		Exchange ex = null;
		if (op.isPresent()) {
			ex = op.get();
		}
		System.out.println("hello" + ex);
		return ex;
	}
}
