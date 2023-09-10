package com.controller;
import java.util.ArrayList;

import java.util.List;

 

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.entity.Coder;
import com.service.CoderService;
@RestController
@RequestMapping("/api")
public class CoderController {
	@Autowired
	CoderService coderservice;
@GetMapping("/getcoder")
public Coder getCoder()
{
	 Coder c1=new Coder();
	 c1.setId(1);
	 c1.setCname("Aniket");
	 c1.setTech("Java");
	 return c1;
}
@GetMapping("/getcoders")
	public List<Coder> getCoders() {

		List<Coder> list= coderservice.getcoders();

		return list;
}
@PostMapping("/addcoder")
public Coder addcoder(@RequestBody Coder c1)

{
	 coderservice.addcoder(c1);
	 return c1;
}
@DeleteMapping(path="/deletecoder")
public String deleteCoder(@RequestBody Coder c2)

{
	  coderservice.deleteCoder(c2);
	  return "deleted";
}
@DeleteMapping(path="/deletecoder/{eid}")
public String deleteCoderById(@PathVariable String eid)

{
	  coderservice.deleteCoderById(eid);
	  return "deleted";
}
@PutMapping("/updatecoder")
public Coder updateCoder(@RequestBody Coder c3)

{
	 coderservice.updateCoder(c3);
	 
	 return c3;
}
}