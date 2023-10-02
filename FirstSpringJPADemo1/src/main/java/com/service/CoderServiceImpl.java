package com.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.entity.Coder;
import com.repository.CoderRepository;
@Service
public class CoderService {
	@Autowired
	CoderRepository repo;
	public List<Coder> getcoders()
	{
		List<Coder> lc =repo.findAll();
		return lc;
	}
	public Coder addcoder(Coder c)
	{
		repo.save(c);
		return c;
	}
	public Coder deleteCoder(Coder c2)
	{
		repo.save(c2);
		return c2;
	}
	public Coder updateCoder(Coder c3)
	{
		repo.save(c3);
		return c3;
	}
	public String deleteCoderById(@PathVariable String eid)

	{
		 return eid;
	}
}