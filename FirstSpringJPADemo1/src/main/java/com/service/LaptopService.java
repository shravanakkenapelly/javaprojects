package com.service;

import java.util.List;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.entity.Laptop;
import com.repository.LaptopRepository;
@Service
public class LaptopService {
	@Autowired
	LaptopRepository repo;
	public TreeSet<Laptop> getlaptops()
	{
		TreeSet<Laptop> lc =(TreeSet<Laptop>) repo.findAll();
		return lc;
	}
	public Laptop addlaptop(Laptop c)
	{
		repo.save(c);
		return c;
	}
	public Laptop deleteLaptop(Laptop c2)
	{
		repo.save(c2);
		return c2;
	}
	public Laptop updateLaptop(Laptop c3)
	{
		repo.save(c3);
		return c3;
	}
	public String deleteLaptopById(@PathVariable String eid)

	{
		 return eid;
	}
}
