package com.controller;

import java.util.List;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Laptop;
import com.service.LaptopService;
@RestController
@RequestMapping("/api")
public class LaptopController {
	@Autowired
	LaptopService laptopservice;
@GetMapping("/getlaptop")
public Laptop getLaptop()
{
	 Laptop c1=new Laptop();
	 c1.setLid(1);
	 c1.setLname("Aniket");
	 c1.setLprice("Java");
	 return c1;
}
@GetMapping("/getlaptops")
	public TreeSet<Laptop> getLaptops() {

      		TreeSet<Laptop> list= (TreeSet<Laptop>) laptopservice.getlaptops();

		return list;
}
@PostMapping("/addlaptop")
public Laptop addlaptop(@RequestBody Laptop c1)

{
	 laptopservice.addlaptop(c1);
	 return c1;
}
@DeleteMapping(path="/deletelaptop")
public String deleteLaptop(@RequestBody Laptop c2)

{
	  laptopservice.deleteLaptop(c2);
	  return "deleted";
}
@DeleteMapping(path="/deletelaptop/{eid}")
public String deleteLaptopById(@PathVariable String eid)

{
	  laptopservice.deleteLaptopById(eid);
	  return "deleted";
}
@PutMapping("/updatelaptop")
public Laptop updateLaptop(@RequestBody Laptop c3)

{
	 laptopservice.updateLaptop(c3);
	 
	 return c3;
}

}
