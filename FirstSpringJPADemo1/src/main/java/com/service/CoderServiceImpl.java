package com.service;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.advices.ResourceNotFoundException;
import com.entity.Coder;
import com.repository.CoderRepository;
@Service
public class CoderServiceImpl {
	@Autowired
	CoderRepository repo;
	public List<Coder> getcoders()
	{
		List<Coder> lc =repo.findAll();
		return lc;
	}
	public Coder addcoder(Coder c)throws Throwable
	{
//		int id=c.getId();
//		 Supplier s2=()->new ResourceNotFoundException("Coder does not exist in the database");
//		 Coder c2=repo.findById(id).orElseThrow(s2);
//		 c2.setCname(c.getCname());
//		 c2.setTech(c.getTech());
//		 repo.save(c2);
//		  return c2;
		 repo.save(c);
		return c;
	}
	public Coder deleteCoder(Coder c2)
	{
		
		repo.save(c2);
	    return c2;
	}
	/*public Coder updateCoder(Coder c3)
	{
		repo.save(c3);
		return c3;
	}*/
	public String deleteCoderById(@PathVariable String eid)

	{
		 return eid;
	}
	 public Optional<Coder> getCoderByName(String cname){
	 Optional<Coder> c1=repo.getCoderByCname(cname);
	 return c1;
}
	 
	 public List<Coder> getCoderByTechSortedByCname(String tech){
	
		 List<Coder> lc=repo.getCoderByTechSortedByCname(tech);
		 return lc;
	 }
	 public Coder updatecoder(Coder c) throws Throwable{
		 int id=c.getId();
		 Supplier s1=()->new ResourceNotFoundException("Coder does not exist in the database");
		 Coder c2=repo.findById(id).orElseThrow(s1);
		 c2.setCname(c.getCname());
		 c2.setTech(c.getTech());
		 repo.save(c2);
		  return c2;
	 }
}