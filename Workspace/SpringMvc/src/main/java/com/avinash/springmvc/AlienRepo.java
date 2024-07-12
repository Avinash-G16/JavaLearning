package com.avinash.springmvc;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.avinash.springmvc.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>
{

//	List<Alien> findByAname(String aname); //Query DSL (Domain Specific Language)
//	List<Alien> findByAnameOrderByAidDesc(String aname);
	@Query("from Alien where aname= :name")
	List<Alien> find(@Param("name") String aname);

}
