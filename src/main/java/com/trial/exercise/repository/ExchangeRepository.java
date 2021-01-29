package com.trial.exercise.repository;

	import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.repository.CrudRepository;
	//import org.springframework.data.repository.PagingAndSortingRepository;
	import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.trial.exercise.model.Exchange;
     @Repository
	public interface ExchangeRepository extends JpaRepository<Exchange, Long>{
		
		
		public List<Exchange> findByItem(String item);
		
		
//		@Query("SELECT e FROM Exchange e WHERE e .amount= :amount")
//	public List<Exchange> listItemWithPriceOver(@Param("amount") float amount );
	}


